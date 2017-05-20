<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Manager</title>

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

	<jsp:include page="../views/fragments/header.jsp"></jsp:include>

	<div class="container">
		<div class="row">

			<div class="form-group">
				<label for="username">username</label> <span>${user.username}</span>
			</div>
			<div class="form-group">
				<label for="password">password</label> <span>${user.password}</span>
			</div>
			<div class="form-group">
				<label for="pollCount">pollCount</label> <span>${user.pollCount}</span>
			</div>
			<div class="form-group">
				<label for="lastSeenDate">lastSeenDate</label> <span>${user.lastSeenDate}</span>
			</div>
			<div class="form-group">
				<label for="userType">userType</label> <span>${user.userType}</span>
			</div>
			<div class="form-group">
				<label for="firstName">firstName</label> <span>${user.userContext.firstName}</span>
			</div>
			<div class="form-group">
				<label for="lastName">lastName</label> <span>${user.userContext.lastName}</span>
			</div>
			<div class="form-group">
				<label for="email">email</label> <span>${user.userContext.email}</span>
			</div>
			<div class="form-group">
				<label for="phone">phone</label> <span>${user.userContext.phone}</span>
			</div>
			<div class="form-group">
				<label for="age">age</label> <span>${user.userContext.age}</span>
			</div>
			<div class="form-group">
				<label for="birdDate">birdDate</label> <span>${user.userContext.burnDate}</span>
			</div>
			<div class="form-group">
				<label for="description">description</label> <span>${user.userContext.description}</span>
			</div>
			<div class="form-group">
				<label for="signUpDate">signUpDate</label> <span>${user.userContext.singUpDate}</span>
			</div>
		</div>
	</div>
</body>
</html>