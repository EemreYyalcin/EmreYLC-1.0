<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CATEGORY</title>

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
		<h2>Questions</h2>
		<table class="table table-hover">
			<tbody>
				<tr>
					<th>Question</th>
					<th>Click-a</th>
					<th>Click-b</th>
					<th>Option-a-name</th>
					<th>Option-a-data</th>
					<th>Option-a-click</th>
					<th>Option-b-name</th>
					<th>Option-b-data</th>
					<th>Option-b-click</th>
					<c:forEach items="${questions}" var="question">
						<tr>
							<td><a href='<spring:url value="/question/${question.id}"/>'>${question.question}</a></td>
							<td>"${question.clickA}"</td>
							<td>"${question.clickB}"</td>
							<c:forEach items="${question.options}" var="option">
								<td>"${option.name}"</td>
								<td>"${option.data}"</td>
								<td>"${option.click}"</td>
							</c:forEach>
						</tr>
					</c:forEach>
				</tr>
			</tbody>
		</table>
	</div>

	<div class="container">
		<div class="row">
			<spring:url value="/question/add" var="formUrl" />
			<form:form modelAttribute="question" action="${formUrl}"
				method="post" cssClass="col-md-8 col-md-offset-2">
				<div class="form-group">
					<label for="Question">Question</label>
					<form:input id="question-question" cssClass="form-control"
						path="question" />
<%-- 					<form:errors path="question-error" /> --%>
				</div>
				<div class="form-group">
					<label for="optionname1">OptionName1</label>
					<form:input id="option-name1" cssClass="form-control"
						path="options[0].name" />
<%-- 					<form:errors path="option-name-error1" /> --%>
				</div>
				<div class="form-group">
					<label for="OptionData1">OptionData1</label>
					<form:input id="option-data1" cssClass="form-control"
						path="options[0].data" />
<%-- 					<form:errors path="option-data-error1" /> --%>
				</div>
				<div class="form-group">
					<label for="optionname2">OptionName2</label>
					<form:input id="option-name2" cssClass="form-control"
						path="options[1].name" />
<%-- 					<form:errors path="option-name-error2" /> --%>
				</div>
				<div class="form-group">
					<label for="OptionData2">OptionData2</label>
					<form:input id="option-data2" cssClass="form-control"
						path="options[1].data" />
<%-- 					<form:errors path="option-data-error2" /> --%>
				</div>
				<button type="submit" class="btn btn-default">Submit</button>
			</form:form>
		</div>
	</div>
</body>
</html>