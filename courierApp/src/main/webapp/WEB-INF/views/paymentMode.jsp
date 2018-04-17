<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<div class="container">
	<h2>${title}</h2>
	<c:if test="${not empty message}">
		<div class=col-xs-12>
			<div class="alert alert-success alert-dismissible">
				<button type="button" class="close" data-dismiss="alert">&times;</button>
				${message}
			</div>
	</c:if>
	<ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a>
		</li>
		<li class="breadcrumb-item active">Setup</li>
		<li class="breadcrumb-item active">Payment Mode</li>
	</ol>
	<sf:form modelAttribute="paymentMode"
		action="${contextRoot}/payment-mode" method="POST">

		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="payCode">Pay Code</label>
				<sf:input type="text" class="form-control" id="payCode"
					path="payCode" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="description">Description</label>
				<sf:input type="text" class="form-control" id="description"
					path="description" />
			</div>
		</div>
		<button class="btn btn-primary" type="submit">Submit form</button>
		<!-- Form End   -->
	</sf:form>
</div>