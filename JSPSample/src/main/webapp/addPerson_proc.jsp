<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page import="sample.dao.PersonDao"%>
<%@page import="sample.dto.PersonInfo"%>
<%@page import="java.util.*"%>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	//addPerson.jsp -> Form 태그 양식 "name" ->submit ->
	//action = "addPerson_proc.jsp"
	//request 기본적으로 있는 내장객체
	String name = request.getParameter("personName");
	PersonDao personDao = new PersonDao();
	int result = personDao.insertPersonInfo(name);

	if (result > 0) {
	%>
	<script> alert("추가되었습니다.")</script>
	<%
	} else {
	%>
	<script> alert("추가 실패하였습니다.")</script>
	<%
	}
	%>
		<script>location.href = "index.jsp"</script>

</body>
</html>