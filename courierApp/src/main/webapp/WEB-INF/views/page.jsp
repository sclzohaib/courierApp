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
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Burki Courier Service</title>

<!-- Bootstrap core CSS -->
<link href="${css2}/bootstrap.css" rel="stylesheet">
<link href="${css2}/bootstrap2.css" rel="stylesheet">
<link href="${css2}/Footer-with-button-logo.css" rel="stylesheet">
<link href="${css2}/font-awesome.min.css" rel="stylesheet">
<link href="${css2}/bootstrapFooter.min.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<!-- Custom styles for this template -->
<link href="${css2}/myapp.css" rel="stylesheet">
</head>

<body>
	
		<!-- Navigation -->
		<%@include file="./shared/navbar.jsp"%>
		<!-- Page Content -->
		<c:if test="${userClickEmployee==true}">
			<%@include file="employee.jsp"%>
		</c:if>
		<c:if test="${userClickManifest==true}">
			<%@include file="manifest.jsp"%>
		</c:if>
		<c:if test="${userClickDelivery==true}">
			<%@include file="delivery.jsp"%>
		</c:if>
		<c:if test="${userClickDeliveryDetail==true}">
			<%@include file="deliveryDetail.jsp"%>
		</c:if>
		<c:if test="${userClickBookInfo==true}">
			<%@include file="book-info.jsp"%>
		</c:if>
		<c:if test="${userClickCity==true}">
			<%@include file="city.jsp"%>
		</c:if>

		<c:if test="${userClickCreditCard==true}">
			<%@include file="creditcard.jsp"%>
		</c:if>

		<c:if test="${userClickCustomer==true}">
			<%@include file="customer.jsp"%>
		</c:if>

		<c:if test="${userClickCustomerTarrif==true}">
			<%@include file="customerTarrif.jsp"%>
		</c:if>

		<c:if test="${userClickHandInstr==true}">
			<%@include file="handInstr.jsp"%>
		</c:if>

		<c:if test="${userClickIntSector==true}">
			<%@include file="intSector.jsp"%>
		</c:if>

		<c:if test="${userClickItem==true}">
			<%@include file="item.jsp"%>
		</c:if>

		<c:if test="${userClickItems==true}">
			<%@include file="items.jsp"%>
		</c:if>

		<c:if test="${userClickPaymentMode==true}">
			<%@include file="paymentMode.jsp"%>
		</c:if>

		<c:if test="${userClickProduct==true}">
			<%@include file="product.jsp"%>
		</c:if>

		<c:if test="${userClickSector==true}">
			<%@include file="sector.jsp"%>
		</c:if>

		<c:if test="${userClickService==true}">
			<%@include file="service.jsp"%>
		</c:if>

		<c:if test="${userClickOmsCnsgRef==true}">
			<%@include file="omsRef.jsp"%>
		</c:if>

		<c:if test="${userClickRoute==true}">
			<%@include file="route.jsp"%>
		</c:if>

		<c:if test="${userClickRateCard==true}">
			<%@include file="rateCard.jsp"%>
		</c:if>

		<c:if test="${userClickTrack==true}">
			<%@include file="track.jsp"%>
		</c:if>

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

		<c:if test="${userClickPortfolio1Col==true}">
			<%@include file="portfolio-1-col.jsp"%>
		</c:if>

		<c:if test="${userClickPortfolio2Col==true}">
			<%@include file="portfolio-2-col.jsp"%>
		</c:if>

		<c:if test="${userClickPortfolio3Col==true}">
			<%@include file="portfolio-3-col.jsp"%>
		</c:if>

		<c:if test="${userClickPortfolio4Col==true}">
			<%@include file="portfolio-4-col.jsp"%>
		</c:if>

		<c:if test="${userClickPortfolioItem==true}">
			<%@include file="portfolio-item.jsp"%>
		</c:if>

		<c:if test="${userClickBlogHome1==true}">
			<%@include file="blog-home-1.jsp"%>
		</c:if>
		<c:if test="${userClickBlogHome2==true}">
			<%@include file="blog-home-2.jsp"%>
		</c:if>

		<c:if test="${userClickBlogPost==true}">
			<%@include file="blog-post.jsp"%>
		</c:if>

		<c:if test="${userClickFullWidth==true}">
			<%@include file="full-width.jsp"%>
		</c:if>

		<c:if test="${userClickSideBar==true}">
			<%@include file="sidebar.jsp"%>
		</c:if>

		<c:if test="${userClickFaq==true}">
			<%@include file="faq.jsp"%>
		</c:if>

		<c:if test="${userClickPage404==true}">
			<%@include file="404.jsp"%>
		</c:if>

		<c:if test="${userClickPricing==true}">
			<%@include file="pricing.jsp"%>
		</c:if>

		<c:if test="${userClickAutofill==true}">
			<%@include file="autofill.jsp"%>
		</c:if>
<c:if test="${userClickMasterDetail==true}">
			<%@include file="test.jsp"%>
		</c:if>




		<!-- /.container -->

		<!-- Footer -->
		<%@include file="./shared/footer.jsp"%>


		
		<!-- Bootstrap core JavaScript -->
		<script src="${js2}/jquery.min.js"></script>
		<script src="${js2}/myapp.js"></script>
		<script src="${js2}/bootstrap.bundle.min.js"></script>
	
</body>

</html>