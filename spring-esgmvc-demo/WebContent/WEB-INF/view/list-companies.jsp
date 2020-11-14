<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Companies</title>
</head>
<body>
	<div>
		<div>
			<h2> List of Companies</h2>
		</div>
	</div>
	
	<div>
		<div>
			<input type="button" value="Add Company" onclick="window.location.href='showFormForAdd'; return false;"/>
		</div>		
	</div>
	
	<div>
		<div>
			<table>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>URL</th>
					<th>Description</th>
					<th>Headquarters</th>
					<th>Sector</th>
					<th>Approved</th>
				</tr>
				
				<c:forEach var="tempCompany" items="${companies}">
					<tr>
						<th>${tempCompany.id}</th>
						<th>${tempCompany.name}</th>
						<th>${tempCompany.url}</th>
						<th>${tempCompany.description}</th>
						<th>${tempCompany.headquarters}</th>
						<th>${tempCompany.sector}</th>
						<th>${tempCompany.approved}</th>			
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
	<div>
		<div>
			<a href="${pageContext.request.contextPath}"> Home Page </a>
		</div>
	</div>
</body>
</html>