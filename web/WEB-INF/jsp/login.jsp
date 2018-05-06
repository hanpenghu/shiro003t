<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/tag.jsp"%>
<html>
<head>

</HEAD>
<BODY>
	<form id ="id1" name="name1" action="${baseurl}login.action" method="POST">
		登录名<input type="text" name="username"/>
		密码<input type="text" name="password"/>
		<input type="submit" value="提交"/>
	</form>

</BODY>
</HTML>
