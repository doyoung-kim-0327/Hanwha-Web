<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	label{
		width: 20%;
		padding: 2px 8px;
		margin: 1px 1px;
		background-color:orange;
		display:inline-block;

	}
	select {
		width: 30%;
	  	padding: 6px 10px;
	  	margin: 2px 0;
	  	display: inline-block;
	  	border: 1px solid #ccc;
	  	border-radius: 4px;
	  	box-sizing: border-box;
	}
	input {
		width: 30%;
	  	padding: 6px 10px;
	  	margin: 2px 0;
	  	display: inline-block;
	  	border: 1px solid #ccc;
	  	border-radius: 4px;
	  	box-sizing: border-box;
	}
	#employee_id {
		background-color: #a6aeba;
	}
	#submit {
		width: 150px;
		margin-left: 43%;
	}
	#submit:hover {
		background-color: #a6aeba;
	}
</style>
</head>
<body>
<h1>직원 정보 수정</h1>
<form action="empdetail" method="post">
<label>직원 번호 :</label><input type="number" name="employee_id" value="${emp.employee_id}" id="employee_id" readonly><br>
<label>직원 성 :</label><input type="text" name="first_name" value="${emp.first_name}"><br>
<label>직원 이름 :</label><input type="text" name="last_name" value="${emp.last_name}"><br>
<label>직원 이메일 :</label><input type="text" name="email" value="${emp.email}"><br>
<label>직원 전화번호 :</label><input type="tel" name="phone_number" value="${emp.phone_number}" pattern="\d{3}-\d{4}-\d{4}"><br>
<label>직원 연봉 :</label><input type="number" name="salary" value="${emp.salary}"><br>
<label>직원 입사일 :</label><input type="date" name="hire_date" value="${emp.hire_date}"><br>
<label>매니저 :</label>
<select name="manager_id">
	<c:forEach items="${managerlist}" var="m">	
		<c:if test="${emp.manager_id == m}">
			<option selected>${m}</option>
		</c:if>
		<c:if test="${emp.manager_id != m}">
			<option>${m}</option>
		</c:if>
	</c:forEach>
</select><br>

<label>부서 :</label>
<select name="department_id">
	<c:forEach items="${deptlist}" var="dept">	
		<option value="${emp.department_id}" ${emp.department_id == dept.department_id ? "selected" : ""}>${dept.department_name}</option>
	</c:forEach>
</select><br>


<label>커미션 :</label><input type="number" name="commission_pct" value="${emp.commission_pct}"><br>
<label>직무 :</label>
<select name="job_id">
	<c:forEach items="${joblist}" var="job">	
		<option ${emp.job_id == job ? "selected" : ""}>${job}</option>
	</c:forEach>
</select><br>


<input type="submit" value="수정하기" id="submit">

</form>


</body>
</html>