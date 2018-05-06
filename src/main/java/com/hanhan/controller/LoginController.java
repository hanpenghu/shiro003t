package com.hanhan.controller;

import com.hanhan.exception.CustomException;
import com.hanhan.test1.hanhan.p;
import com.hanhan.test1.shiro.CustomRealm;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 
 * <p>Title: LoginController</p>
 * <p>Description: 登陆和退出</p>
 * <p>Company: www.itcast.com</p> 
 * @author	传智.燕青
 * @date	2015-3-22下午4:43:26
 * @version 1.0
 */
@Controller
public class LoginController {
	

	
	
	//用户登陆提交方法
	/**
	 * 
	 * <p>Title: login</p>
	 * <p>Description: </p>
	 * @param session
	 * @param randomcode 输入的验证码
	 * @param usercode 用户账号
	 * @param password 用户密码 
	 * @return
	 * @throws Exception
	 */
	/*@RequestMapping("/login")
	public String login(HttpSession session, String randomcode,String usercode,String password)throws Exception{
		
		//校验验证码，防止恶性攻击
		//从session获取正确验证码
		String validateCode = (String) session.getAttribute("validateCode");
		
		//输入的验证和session中的验证进行对比 
		if(!randomcode.equals(validateCode)){
			//抛出异常
			throw new CustomException("验证码输入错误");
		}
		
		//调用service校验用户账号和密码的正确性
		ActiveUser activeUser = sysService.authenticat(usercode, password);
		
		//如果service校验通过，将用户身份记录到session
		session.setAttribute("activeUser", activeUser);
		//重定向到商品查询页面
		return "redirect:/first.action";
	}*/
	
	//登陆提交地址，和applicationContext-shiro.xml中配置的loginurl一致
	@RequestMapping("login")
	public String login(HttpServletRequest request, HttpServletResponse response)throws Exception{

		String username = request.getParameter("username");
		String password=request.getParameter("password");
		p.p("-------------------------login.action是否能够得到用户名和密码------------------------------");
		p.p(username);
		p.p(password);
		p.p("-------------------------------------------------------");


		String type = request.getParameter("type");
		if(null!=type){
			if("mobile".equals(type)){
				p.p("-------------------------------------------------------");
				p.p("我是来自手机端的请求");
				p.p("-------------------------------------------------------");
				//跳转到另外一个地方
				request.getRequestDispatcher("/mobile.action").forward(request,response);
			}
		}

		//实现前后分离
//		// 在自己登录的rest里面写，比如UserRest里面的login方法中，user为传递过来的参数
//		Subject currentUser = SecurityUtils.getSubject();
//		UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(), user.getPassword());
//// 开始进入shiro的认证流程
//		currentUser.login(token);







		//如果登陆失败从request中获取认证异常信息，shiroLoginFailure就是shiro异常类的全限定名
		String exceptionClassName = (String) request.getAttribute("shiroLoginFailure");
		//根据shiro返回的异常类路径判断，抛出指定异常信息
		if(exceptionClassName!=null){
			if (UnknownAccountException.class.getName().equals(exceptionClassName)) {
				//最终会抛给异常处理器
				throw new CustomException ("账号不存在");
			} else if (IncorrectCredentialsException.class.getName().equals(
					exceptionClassName)) {
				throw new CustomException("用户名/密码错误");
			} else if("randomCodeError".equals(exceptionClassName)){
				throw new CustomException("验证码错误 ");
			}else {
				throw new Exception();//最终在异常处理器生成未知错误
			}
		}
		//此方法不处理登陆成功（认证成功），shiro认证成功会自动跳转到上一个请求路径
		//登陆失败还到login页面
		return "/WEB-INF/jsp/login.jsp";
	}



	@Autowired
	private org.apache.shiro.web.mgt.DefaultWebSecurityManager securityManager;

	@Autowired
	private CustomRealm customRealm;

	//处理手机端
	@RequestMapping("/mobile")
	public void mobile(HttpServletResponse response,HttpServletRequest request){
		p.p("-------------------------------------------------------");
		p.p("您已经来到手机端控制层");
		p.p("-------------------------------------------------------");
		String username=request.getParameter("username");
		String password = request.getParameter("password");
		//将username和password做成token传给我们的
		SecurityUtils.setSecurityManager(securityManager);
		Subject subject = SecurityUtils.getSubject();
		// 创建token令牌
		UsernamePasswordToken token = new UsernamePasswordToken(username,password);
		try {
			subject.login(token);
			//这一步之后直接走了realm的认证方法
		} catch (Exception e) {
			e.printStackTrace();
			p.p("-------------------------------------------------------");
			p.p("没有认证通过");
			p.p("-------------------------------------------------------");
		}

		//认证通过,开始授权//直接调用realm授权

		AuthorizationInfo authorizationInfo = customRealm.doGetAuthorizationInfo(subject.getPrincipals());

		List<String> permissions= (List<String>) authorizationInfo.getStringPermissions();

		p.p("-------------------------------------------------------");
		p.p("该移动端的所有权限是: ");
		p.p(permissions);
		p.p("-------------------------------------------------------");

		//得到shiro的session
		Session session = subject.getSession();
		//把验证和授权放入shiro

		String token1 = p.uuid();
		session.setAttribute("token1",token1);
		session.setAttribute("quanXian",permissions);

		//接下来的代码逻辑是: 所有的移动端路径在shiro开个口子,匿名,然后手动用token认证和取出权限,这个可以配置
		//在xml,做成拦截器,也可以直接做成代码工具进行验证
		//也可以单独抽出来一层代码,如果是验证不通过,直接return msg


	}










/*	//用户退出
	@RequestMapping("/logout")
	public String logout(HttpSession session)throws Exception{
		
		//session失效
		session.invalidate();
		//重定向到商品查询页面
		return "redirect:/first.action";
		
	}*/
	

}
