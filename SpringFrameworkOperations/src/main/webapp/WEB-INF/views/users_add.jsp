<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Polls Manager</title>

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
			<spring:url value="/user/review" var="formUrl" />
			<form:form modelAttribute="user" action="${formUrl}" method="post"
				cssClass="col-md-8 col-md-offset-2">

				<div class="form-group">
					<label for="username">Username</label>
					<form:input id="user-username" cssClass="form-control"
						path="username" />
					<form:errors path="username" />
				</div>

				<div class="form-group">
					<label for="password">Password</label>
					<form:input maxlength="10" id="user-password"
						cssClass="form-control" path="password" />
				</div>

				<div class="form-group">
					<label for="firstname">FirstName</label>
					<form:input id="user-firstName" cssClass="form-control"
						path="userContext.firstName" />
				</div>
				<div class="form-group">
					<label for="lastname">LastName</label>
					<form:input id="user-name" cssClass="form-control"
						path="userContext.lastName" />
				</div>
				<div class="form-group">
					<label for="age">Age</label>
					<form:input id="user-age" cssClass="form-control"
						path="userContext.age" />
				</div>
				<div class="form-group">
					<label for="e-mail">E-Mail</label>
					<form:input id="user-email" cssClass="form-control"
						path="userContext.email" />
				</div>
				<div class="form-group">
					<label for="phone">Phone</label>
					<form:input id="user-phone" cssClass="form-control"
						path="userContext.phone" />
				</div>
				<div class="form-group">
					<label for="BurnDate">BurnDate</label>
					<form:input id="user-burnDate" cssClass="form-control"
						path="userContext.burnDate" />
				</div>
				<div class="form-group">
					<label for="description">Description</label>
					<form:input id="user-description" cssClass="form-control"
						path="userContext.description" />
				</div>
				<div class="form-group">
					<label for="singUpDate">SingUpDate</label>
					<form:input id="user-singUpDate" cssClass="form-control"
						path="userContext.singUpDate" />
				</div>
				<div class="form-group">
					<label for="lastSeenDate">LastSeenDate</label>
					<form:input id="user-lastSeenDate" cssClass="form-control"
						path="lastSeenDate" />
				</div>
				<div class="form-group">
					<label for="userType">UserType</label>
					<form:input id="user-userType" cssClass="form-control"
						path="userType" />
				</div>


				<button type="submit" class="btn btn-default">Submit</button>

			</form:form>

		</div>
	</div>
</body>
</html>