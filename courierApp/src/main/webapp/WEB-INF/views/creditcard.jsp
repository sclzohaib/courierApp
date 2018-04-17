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
		<li class="breadcrumb-item active">Credit Card</li>
	</ol>
	<sf:form modelAttribute="creditcard" action="${contextRoot}/creditcard"
		method="POST">

		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="cityNo">City No</label>
				<sf:input type="text" class="form-control" id="cityNo" path="cityNo" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="productId">Product Id</label>
				<sf:input type="text" class="form-control" id="productId"
					path="productId" />
			</div>
		</div>

		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="sectNo">Sect No</label>
				<sf:input type="text" class="form-control" id="sectNo" path="sectNo" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="countryCode">Country Code</label>
				<sf:input type="text" class="form-control" id="countryCode"
					path="countryCode" />
			</div>
		</div>
		<div class="form-row">

			<div class="col-md-3 mb-3">
				<label for="countryNo">Country No</label>
				<sf:input type="text" class="form-control" id="countryNo"
					path="countryNo" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="serviceNo">Service No</label>
				<div class="input-group">
					<sf:input type="text" class="form-control" id="serviceNo"
						path="serviceNo" aria-describedby="inputGroupPrepend3" />
				</div>
			</div>
		</div>
		<button class="btn btn-primary" type="submit">Submit form</button>
		<!-- Form end -->
	</sf:form>
</div>