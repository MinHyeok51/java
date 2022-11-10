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
	int id =Integer.parseInt(request.getParameter("id"));
	PersonInfo personInfo = new PersonInfo();
	personInfo.setId(id);
	personInfo.setName(name);
	
	PersonDao personDao = new PersonDao();
	int result = personDao.updatePersonInfo(personInfo);

	if (result > 0) {
	%>
	<script> 
		alert("수정되었습니다.")
		location.href="index.jsp"
	</script>
	<%
	} else {
	%>
	<script> 
		alert("수정 실패하였습니다.")
		location.href = "personInfoDetail.jsp?id=<%=id%>"
	</script>
	<%
	}
	%>
		<script>location.href = "index.jsp"</script>

</body>
</html>