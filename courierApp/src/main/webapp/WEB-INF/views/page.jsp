<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css2" value="/resources/css2" />
<spring:url var="js2" value="/resources/js2" />
<spring:url var="images" value="/resources/images" />
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Burki Courier Service</title>

<!-- Bootstrap core CSS -->
<link href="${css2}/bootstrap.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css2}/myapp.css" rel="stylesheet">

</head>

<body>

	<!-- Navigation -->
	<%@include file="./shared/navbar.jsp"%>
	<!-- Page Content -->
	<c:if test="${userClickHome==true}">
		<%@include file="home.jsp"%>
	</c:if>

	<c:if test="${userClickAbout==true}">
		<%@include file="about.jsp"%>
	</c:if>


	<c:if test="${userClickContact==true}">
		<%@include file="contact.jsp"%>
	</c:if>

	<c:if test="${userClickServices==true}">
		<%@include file="services.jsp"%>
	</c:if>
	<c:if test="${userClickEmployee==true}">
		<%@include file="employee.jsp"%>
	</c:if>
	<c:if test="${userClickMenifest==true}">
		<%@include file="manifest.jsp"%>
	</c:if>
	<c:if test="${userClickDelivery==true}">
		<%@include file="delivery.jsp"%>
	</c:if>
	<!-- /.container -->

	<!-- Footer -->
	<%@include file="./shared/footer.jsp"%>

	<!-- Bootstrap core JavaScript -->
	<script src="${js2}/jquery.min.js"></script>
	<script src="${js2}/bootstrap.bundle.min.js"></script>

</body>

</html>