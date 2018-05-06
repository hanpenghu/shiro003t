<%--<%@ taglib prefix="apache shiro" uri="http://shiro.apache.org/tags" %>--%>
<%@ taglib uri="http://shiro.apache.org/tags" prefix="shiro" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/tag.jsp"%>
<html>
<head>

</HEAD>

<BODY style="overflow-y: hidden;" class="easyui-layout" scroll="no" >


			
	<%--	<c:if test="${activeUser.menus!=null }">
			<ul>
			<c:forEach items="${activeUser.menus }" var="menu">--%>

				<shiro:hasPermission name="user:create">


					我曹阿佛法大司法考试砥砺奋进来的
			<%--	<li><div>
					<a title="${menu.name }" ref="1_1" href="#"
						rel="${baseurl }/${menu.url }" icon="icon-log"><span
						class="icon icon-log">&nbsp;</span><span class="nav"><a href=javascript:addTab('${menu.name }','${baseurl }/${menu.url }')>${menu.name }</a></span></a>
				</div></li>--%>
				</shiro:hasPermission>
	<%--		</c:forEach>
			</ul>
		</c:if>--%>
			<%-- <ul>
			<li><div>
					<a title="创建采购单" ref="1_1" href="#"
						rel="${baseurl} items/queryItems.action" icon="icon-log"><span
						class="icon icon-log">&nbsp;</span><span class="nav"><a href=javascript:addTab('创建采购单','${baseurl}items/queryItems.action')>商品查询</a></span></a>
				</div></li>
			<li><div>
					<a title="提交采购单" ref="1_1" href="#"
						rel="/purchasing/order/orderList.action?type=1" icon="icon-log"><span
						class="icon icon-log">&nbsp;</span><span class="nav">提交采购单</span></a>
				</div></li>
			<li><div>
					<a title="部门经理审核" ref="1_1" href="#"
						rel="/purchasing/order/orderList.action?type=2" icon="icon-log"><span
						class="icon icon-log">&nbsp;</span><span class="nav">部门经理审核</span></a>
				</div></li>
			<li><div>
					<a title="总经理审核" ref="1_1" href="#"
						rel="/purchasing/order/orderList.action?type=3" icon="icon-log"><span
						class="icon icon-log">&nbsp;</span><span class="nav">总经理审核</span></a>
				</div></li>
		</ul> --%>


</BODY>
</HTML>
