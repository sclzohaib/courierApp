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
		<li class="breadcrumb-item active">Items</li>
	</ol>
	<sf:form modelAttribute="items" action="${contextRoot}/items"
		method="POST">

		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="awbNo">AWB No</label>
				<sf:input type="text" class="form-control" id="awbNo" path="awbNo" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="itemCode">Item Code</label>
				<sf:input type="text" class="form-control" id="itemCode"
					path="itemCode" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="qty">Quantity</label>
				<sf:input type="number" class="form-control" id="qty" path="qty" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="charges">Charges</label>
				<sf:input type="number" class="form-control" id="charges"
					path="charges" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="deliveryCharges">Delivery Charges</label>
				<sf:input type="number" class="form-control" id="deliveryCharges"
					path="deliveryCharges" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="sprate">SP Rate</label>
				<sf:input type="number" class="form-control" id="sprate"
					path="sprate" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="itemsCalldate">Items Call Date</label>
				<sf:input type="date" class="form-control" id="itemsCalldate"
					path="itemsCalldate" />
			</div>
		</div>

		<button class="btn btn-primary" type="submit">Submit form</button>
	</sf:form>
</div>