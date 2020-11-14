<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Document</title>
</head>
<body>
	<div>
		<div>
			<h2> List of Documents</h2>
		</div>
	</div>
	
	<div>
		<div>
			<input type="button" value="Add Document" onclick="window.location.href='showFormForAdd'; return false;"/>
		</div>		
	</div>
	
	<div>
		<div>
			<table>
				<tr>
					<th>ID</th>
					<th>Source</th>
					<th>URL</th>
					<th>Title</th>
					<th>Author</th>
					<th>Sector</th>
					<th>Date</th>
					<th>Company</th>
					<th>Country</th>
					<th>Approved</th>
					<th>ESG</th>
				</tr>
				
				<c:forEach var="tempDocument" items="${documents}">
					<tr>
						<th>${tempDocument.id}</th>
						<th>${tempDocument.source}</th>
						<th>${tempDocument.url}</th>
						<th>${tempDocument.title}</th>
						<th>${tempDocument.author}</th>
						<th>${tempDocument.sector}</th>
						<th>${tempDocument.date}</th>
						<th>${tempDocument.company}</th>
						<th>${tempDocument.country}</th>
						<th>${tempDocument.approved}</th>
						<th>${tempDocument.esgIssue}</th>			
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