<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生信息</title>
</head>
<body>

	姓名：${student.name}   <br/> 
	密码： ${student.password} <br/> 
	性别：${student.sex}   <br/> 
	专业：${student.specialty}   <br/> 
	生日：${student.birthday}   <br/> 
	手机：${student.phone_number}   <br/> 
	地址：${student.address}   <br/> 
	邮箱：${student.email}   <br/> 
	
	<form action="${basePath}/lookGrade.do" method="post">
		<input type="submit" value="查看成绩">
	</form>
	
</body>
</html>