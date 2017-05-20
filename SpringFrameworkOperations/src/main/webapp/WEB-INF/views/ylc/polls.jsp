<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${category.name}</title>

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
		<h2>Polls</h2>
		<table class="table table-hover">
			<tbody>
				<tr>
					<th>Poll Name</th>
					<th>Poll Level</th>
					<c:forEach items="${polls}" var="poll">
						<tr>
							<td><a href='<spring:url value="/poll/${poll.id}"/>'>${poll.name}</a></td>
							<td>"${poll.level}"</td>
						</tr>
					</c:forEach>
				</tr>

			</tbody>

		</table>
		
		<a href='<spring:url value="/category/${category.id}/previouselement }"/>'>PREVIOUS</a>
		<a href='<spring:url value="/category/${category.id}/nextelement"/>'>NEXT</a>
	</div>
</body>
</html>