<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>学生信息</h2>
	<table id="tab" border="1" width="800">
	<tr>
		<td>编号</td>
		<td>班级</td>
		<td>姓名</td>
		<td>性别</td>
		<td>年龄</td>
		<td>时间</td>
		<td>管理</td>
	</tr>
	<s:iterator value="#request.stuList" var="obj" status="ids">
	<tr>
		<td>${ids.count }</td>
		<td>${obj[1].cname }</td>
		<td>${obj[0].sname }</td>
		<td>${obj[0].ssex }</td>
		<td>${obj[0].sage }</td>
		<td>${obj[0].sdate }</td>
		<td>
		<a href="">修改</a>&nbsp;|&nbsp;
		<a href="stuAction_deleteStu?stu.sno=${obj[0].sno} }">删除</a>
		
		</td>
	</tr>
	</s:iterator>
	</table>
</body>
</html>