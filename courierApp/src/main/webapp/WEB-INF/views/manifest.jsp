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
		<li class="breadcrumb-item active">Forms</li>
		<li class="breadcrumb-item active">Manifest</li>
	</ol>
	<sf:form modelAttribute="manifest" action="${contextRoot}/manifest"
		method="POST">
		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="id">ID</label>
				<sf:input type="text" class="form-control" id="id" path="id" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="bagNo">Bag Number</label>
				<sf:input type="text" class="form-control" id="bagNo" path="bagNo" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="type">Manifest Type</label>
				<sf:input type="text" class="form-control" id="type" path="type" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="origin">Origin</label>
				<div class="input-group">
					<sf:input type="text" class="form-control" id="origin"
						path="origin" aria-describedby="inputGroupPrepend3" />
				</div>
			</div>
			<div class="col-md-3 mb-3">
				<label for="destination">Destination</label>
				<sf:input type="text" class="form-control" id="destination"
					path="destination" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="mDate">Date</label>
				<sf:input type="date" class="form-control" id="mDate" path="mDate" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="vehicleNo">Vehicle Number</label>
				<sf:input type="text" class="form-control" id="vehicleNo"
					path="vehicleNo" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="totalQuantity">Total Quantity</label>
				<sf:input type="text" class="form-control" id="totalQuantity"
					path="totalQuantity" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="totalWeight">Total Weight</label>
				<sf:input type="text" class="form-control" id="totalWeight"
					path="totalWeight" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="product">Product</label>
				<sf:input type="text" class="form-control" id="product"
					path="product" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="employee">Employee</label>
				<sf:input type="text" class="form-control" id="employee"
					path="employee" />
			</div>
		</div>
		<button class="btn btn-primary" type="submit">Submit form</button>
	</sf:form>
</div>