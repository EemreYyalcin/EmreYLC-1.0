<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Account Manager</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link rel="stylesheet"
	href="<spring:url value="/resources/css/home.css"/>" type="text/css" />
<link rel="stylesheet"
	href="<spring:url value="/resources/css/bootstrap-select.min.css"/>"
	type="text/css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<script
	src="<spring:url value="/resources/js/bootstrap-select.min.js"/>"></script>

</head>
<body>

	<jsp:include page="../../views/fragments/header.jsp"></jsp:include>

	<div class="container">
		<div class="row">

			<div class="form-group">
				<label for="username">username</label> <span>${account.userName}</span>
			</div>
			<div class="form-group">
				<label for="password">password</label> <span>${account.password}</span>
			</div>
			<div class="form-group">
				<label for="pollCount">identity</label> <span>${account.identity}</span>
			</div>
			<div class="form-group">
				<label for="firstname">firstname</label> <span>${account.personelInformation.firstName}</span>
			</div>
			<div class="form-group">
				<label for="lastname">lastname</label> <span>${account.personelInformation.lastName}</span>
			</div>
			<div class="form-group">
				<label for="burndate">burndate</label> <span>${account.personelInformation.burnDate}</span>
			</div>
			<div class="form-group">
				<label for="sex">sex</label> <span>${account.personelInformation.sex}</span>
			</div>
		</div>
	</div>
</body>
</html>