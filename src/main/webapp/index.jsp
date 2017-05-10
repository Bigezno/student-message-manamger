<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>主页</title>
<body>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<h2>信息管理系统主页</h2>
	<form action="<%=path%>/login.do" method="post">
		登录选择：<select name="loginTarget">
      		<option value="manamger"  label="管理员"/>
      		<option value="teacher"  label="教师"/>
      		<option value="student"  label="学生"/>
      		</select>
      	<input type="submit" value="提交"/>
	</form>
	
	<form action="<%=path%>/register.do" method="post">
		注册：<select name="registerTarget">
      		<option value="teacher"  label="教师"/>
      		<option value="student"  label="学生"/>
      		</select>
      	<input type="submit" value="提交"/>
	</form>
	
	<a href="${basePath}/student-message-manamger/findword.do">忘记密码？(仅支持教辅人员找回)</a>
	
</body>
</html>
