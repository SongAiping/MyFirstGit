<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>修改学生</h2>
	<s:form method="post" action="stuAction_doUpdateStu">
		<s:hidden name="stu.sno"/>
		姓名：<s:textfield name="stu.sname"/><br/>
		性别:<s:radio list="{'男','女'}" name="stu.ssex" value="%{'男'}"/><br/>
		年龄：<s:textfield name="stu.sage"/><br/>
		入学时间<s:textfield name="stu.sdate"/><br/>
		<s:select name="stu.cls.cno" list="#request.clsList" headerKey="" headerValue="请选择班级" listKey="cno" listValue="cname"/><br/>
		<s:submit value="修改学生"/>
	</s:form>
	<a href="stuAction_findStuList">查询学生</a>
	<a href="index.jsp">首页</a>
</body>
</html>