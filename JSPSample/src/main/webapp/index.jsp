<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page import="sample.dao.PersonDao"%>
<%@page import="sample.dto.PersonInfo"%>
<%@page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
	crossorigin="anonymous">
</head>
<body>
	<%@ include file="navBar.jsp"%>

	<%
	PersonDao personDao = new PersonDao();
	List<PersonInfo> personInfoList = personDao.selectPersonInfoList();
	%>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">ID</th>
				<th scope="col">NAME</th>
			</tr>
		</thead>
		<tbody>
			<%
			if (personInfoList != null && personInfoList.size() > 0) {
				for (PersonInfo info : personInfoList) {
			%>
			<tr>
				<th><%=info.getId()%></th>
				<td><a href="personInfoDetail.jsp?id=<%=info.getId()%>"><%out.println(info.getName());%></a></td>
			</tr>
			<%
			}
			}
			%>
			<%
			// 				if(personInfoList != null && personInfoList.size() > 0){
			// 					for(PersonInfo info : personInfoList){
			// 						out.println("<tr>");
			// 						out.println("<td>" + info.getId()+"</td>");
			// 						out.println("<td>" + info.getName() + "</td>");
			// 						out.println("</tr>");
			// 					}} 주석 : ctrl + shift + c
			%>
		</tbody>
	</table>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
		crossorigin="anonymous"></script>
</body>
</html>