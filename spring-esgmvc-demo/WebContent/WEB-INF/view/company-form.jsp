<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

	<head>
		<title>Document</title>
	</head>
	<style>
		.error{color:red}
	</style>
	<body>
		<form:form action="saveCompany" modelAttribute="company" method="POST">
			Name: <form:input path="name"/>
			<form:errors path="name" cssClass="error"/>
			<br><br>
			URL: <form:input path="url"/>
			<br><br>
			Description: <form:input path="description"/>
			<form:errors path="description" cssClass="error"/>
			<br><br>			
			Country:
			<form:select path="headquarters">
				<form:options items="${company.countryOptions}"/>
			</form:select>
			<form:errors path="headquarters" cssClass="error"/>
			<br><br>
			Sector:	
			<form:select path="sector">
				<form:options items="${company.sectorOptions}"/>
			</form:select>				
			<br><br>
			Approved:  
			Yes <form:radiobutton path="approved" value="Yes"/>
			No <form:radiobutton path="approved" value="No"/>
			<br><br>
			<input type="submit" value="Submit"/>
		</form:form>
	</body>

</html>

