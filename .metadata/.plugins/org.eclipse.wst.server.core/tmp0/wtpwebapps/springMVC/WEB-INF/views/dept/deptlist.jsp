<%@page import="java.util.List"%>
<%@page import="com.hanwha.model.DeptDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function call() {
		location.href = "deptinsert";
	}
</script>
</head>
<body>
<h1>부서목록......${name}</h1>
<h2>자료 건수 : ${deptcount}</h2>
<button onclick="call()">부서추가</button>
<hr>
<table border="1">
	<tr>
		<td>부서번호</td><td>부서이름</td><td></td>
	</tr>
	<c:forEach var="dept" items="${deptlist}">
	<tr>
		<td><a href="deptdetail?deptid=${dept.department_id}">${dept.department_id}</a></td>
		<td>${dept.department_name}</td>
		<td><a href="deptdelete?deptid=${dept.department_id }">삭제하기</a></td>
	</tr>
	</c:forEach>
</table>
</body>
</html>