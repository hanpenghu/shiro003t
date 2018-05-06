package com.hanhan.test1.shiro;


import com.hanhan.test1.dao.mapperJava1.SysPermissionMapper;
import com.hanhan.test1.dao.mapperJava1.SysRolePermissionMapper;
import com.hanhan.test1.dao.mapperJava1.SysUserMapper;
import com.hanhan.test1.dao.mapperJava1.SysUserRoleMapper;
import com.hanhan.test1.dto.*;
import com.hanhan.test1.hanhan.p;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * <p>
 * Title: CustomRealm
 * </p>
 * <p>
 * Description:自定义realm
 * </p>
 * <p>
 * Company: www.itcast.com
 * </p>
 * 
 * @author 传智.燕青
 * @date 2015-3-23下午4:54:47
 * @version 1.0
 */
public class CustomRealm extends AuthorizingRealm {
	
	@Autowired
	private SysUserMapper sysUserMapper;
	@Autowired
	private SysUserRoleMapper sysUserRoleMapper;
	@Autowired
	private SysRolePermissionMapper sysRolePermissionMapper;

	@Autowired
	private SysPermissionMapper sysPermissionMapper;

	// 设置realm的名称
	@Override
	public void setName(String name) {
		super.setName("customRealm");
	}


	
	//realm的认证方法，从数据库查询用户信息
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		
		// token是用户输入的用户名和密码 
		// 第一步从token中取出用户名
		String userCode = (String) token.getPrincipal();

		// 第二步：根据用户输入的userCode从数据库查询
		SysUser sysUser = null;
		try {
			SysUserExample sysUserExample=new SysUserExample();
			sysUserExample.createCriteria().andUsercodeEqualTo(userCode);
			List<SysUser> sysUsers = sysUserMapper.selectByExample(sysUserExample);
			if(p.notEmpty(sysUsers)){
				sysUser=sysUsers.get(0);
			}

		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// 如果查询不到返回null
		if(sysUser==null){//
			return null;
		}
		// 从数据库查询到密码//加密过的
		String password = sysUser.getPassword();
		
		//盐
		String salt = sysUser.getSalt();

		ActiveUser activeUser = new ActiveUser();

		activeUser.setUserid(sysUser.getId());
		activeUser.setUsercode(sysUser.getUsercode());
		activeUser.setUsername(sysUser.getUsername());
		// 如果查询到返回认证信息AuthenticationInfo
		
		//activeUser就是用户身份信息

		

		try {

			//根据用户id找到该用户对应的所有角色id
			SysUserRoleExample sysUserRoleExample =new SysUserRoleExample();
			sysUserRoleExample.createCriteria().andSysUserIdEqualTo(sysUser.getId());
			List<SysUserRole> sysUserRoles = sysUserRoleMapper.selectByExample(sysUserRoleExample);
			if(p.empty(sysUserRoles)){
				return null;
			}

			List<SysRolePermission>srp=new ArrayList<>();//
			//找到该角色对用的所有权限id
			for(SysUserRole s:sysUserRoles){
				String sysRoleId = s.getSysRoleId();
				//找到所有权限
				SysRolePermissionExample sysRolePermissionExample=new SysRolePermissionExample();
				sysRolePermissionExample.createCriteria().andSysRoleIdEqualTo(sysRoleId);
				List<SysRolePermission> sysRolePermissions = sysRolePermissionMapper.selectByExample(sysRolePermissionExample);
				if(p.notEmpty(sysRolePermissions)){
					srp.addAll(sysRolePermissions);
				}
			}
			if(p.empty(srp)){
				return null;
			}

			List<SysPermission> sysPermissions=new ArrayList<>();
			//得到所有权限
			for(SysRolePermission ss:srp){
				String sysPermissionId = ss.getSysPermissionId();
				SysPermissionExample sysPermissionExample=new SysPermissionExample();
				sysPermissionExample.createCriteria().andIdEqualTo(new Long(sysPermissionId));
				List<SysPermission> sysPermissions1 = sysPermissionMapper.selectByExample(sysPermissionExample);
				if(p.notEmpty(sysPermissions1)){
					sysPermissions.addAll(sysPermissions1);
				}

			}



			//找到所有权限
			activeUser.setPermissions(sysPermissions);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		//将activeUser设置simpleAuthenticationInfo
		//2018_4_30   weekday(1)   23:37:59 add Wiston
		// 放入的activeUser只是为了在下面一个方法授权的时候取用
		//并没有用于验证,因为验证用的密码和用户名已经在token中就等于已经在shiro中,
		//下面的password也是我们在数据库查询的加密后的password,指定后一个参数salt,就行了,salt的加密次数和方法在xml中配置
		SimpleAuthenticationInfo simpleAuthenticationInfo =
				new SimpleAuthenticationInfo(
						activeUser, password, ByteSource.Util.bytes(salt), this.getName());

		return simpleAuthenticationInfo;
	}
	
	

	// 用于授权
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		p.p("-------------------------------------------------------");
		p.p("doGetAuthorizationInfo开始");
		p.p("-------------------------------------------------------");
		//从 principals获取主身份信息
		//将getPrimaryPrincipal方法返回值转为真实身份类型（在上边的doGetAuthenticationInfo认证通过填充到SimpleAuthenticationInfo中身份类型），
		ActiveUser activeUser =  (ActiveUser) principals.getPrimaryPrincipal();
		
		//根据身份信息获取权限信息
		//从数据库获取到权限数据
		List<SysPermission> permissionList = null;
		try {
			permissionList = activeUser.getPermissions();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//单独定一个集合对象 
		List<String> permissions = new ArrayList<String>();
		if(permissionList!=null){
			for(SysPermission sysPermission:permissionList){
				//将数据库中的权限标签 符放入集合
				permissions.add(sysPermission.getPercode());
			}
		}
		
		
	/*	List<String> permissions = new ArrayList<String>();
		permissions.add("user:create");//用户的创建
		permissions.add("item:query");//商品查询权限
		permissions.add("item:add");//商品添加权限
		permissions.add("item:edit");//商品修改权限
*/		//....
		
		//查到权限数据，返回授权信息(要包括 上边的permissions)
		SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
		//将上边查询到授权信息填充到simpleAuthorizationInfo对象中
		simpleAuthorizationInfo.addStringPermissions(permissions);

		p.p("-------------------------------------------------------");
		p.p(permissions);
		p.p("-------------------------------------------------------");
		return simpleAuthorizationInfo;
	}
	
	//清除缓存
	public void clearCached() {
		PrincipalCollection principals = SecurityUtils.getSubject().getPrincipals();
		super.clearCache(principals);
	}


}
