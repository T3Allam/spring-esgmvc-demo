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
		<form:form action="saveDocument" modelAttribute="document">
			source: <form:input path="source"/>
			<form:errors path="source" cssClass="error"/>
			<br><br>
			URL: <form:input path="url"/>
			<form:errors path="url" cssClass="error"/>
			<br><br>
			title: <form:input path="title"/>
			<form:errors path="title" cssClass="error"/>
			<br><br>	
			author: <form:input path="author"/>					
			<br><br>
			Company: <form:input path="company"/>
			<form:errors path="company" cssClass="error"/><br><br>			
			Date: <form:input placeholder="YYYY-MM-DD" type="date" path="date"/>			
			<form:errors path="date" cssClass="error"/>
			<br><br>						
			Country:
			<form:select path="country">
				<form:options items="${document.countryOptions}"/>
			</form:select>
			<br><br>
			Sector:
			<form:select path="sector">
				<form:options items="${document.sectorOptions}"/>
			</form:select>					
			<br><br>
			ESG Issue:
			<form:select path="esgIssue">
				<form:options items="${document.esgOptions}"/>
			</form:select>					
			<br><br>
			Approved:
			Yes <form:radiobutton path="approved" value="Yes"/>
			No <form:radiobutton path="approved" value="No"/>
			<br><br>
				
			<br><br>
			<input type="submit" value="Submit"/>
		</form:form>
	</body>

</html>

