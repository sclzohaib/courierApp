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
		<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
		<li class="breadcrumb-item active">Forms</li>
		<li class="breadcrumb-item active">City</li>
	</ol>
	<sf:form modelAttribute="city" action="${contextRoot}/city"
		method="POST">
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="cityNo">City No</label>
				<sf:input type="text" class="form-control" id="cityNo" path="cityNo" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="description">Description</label>
				<sf:input type="text" class="form-control" id="description"
					path="description" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="areaNo">Area No</label>
				<sf:input type="text" class="form-control" id="areaNo" path="areaNo" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="productId">Product ID</label>
				<sf:input type="text" class="form-control" id="productId"
					path="productId" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="serviceNo">Service No</label>
				<sf:input type="text" class="form-control" id="serviceNo"
					path="serviceNo" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="hubstat">Hubstat</label>
				<sf:input type="text" class="form-control" id="hubstat"
					path="hubstat" />
			</div>
		</div>

		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="hubName">Hub Name</label>
				<sf:input type="text" class="form-control" id="hubName"
					path="hubName" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="contactPerson">Contact Person</label>
				<sf:input type="text" class="form-control" id="contactPerson"
					path="contactPerson" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="designation">Designation</label>
				<sf:input type="text" class="form-control" id="designation"
					path="designation" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="address1">Address 1</label>
				<sf:input type="text" class="form-control" id="address1"
					path="address1" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="address2">Address 2</label>
				<sf:input type="text" class="form-control" id="address2"
					path="address2" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="address3">Address 3</label>
				<sf:input type="text" class="form-control" id="address3"
					path="address3" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="countryNo">Country No</label>
				<sf:input type="text" class="form-control" id="countryNo"
					path="countryNo" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="intrAddress">Intr Address</label>
				<div class="input-group">
					<sf:input type="text" class="form-control" id="intrAddress"
						path="intrAddress" aria-describedby="inputGroupPrepend3" />
				</div>
			</div>
			<div class="col-md-2 mb-3">
				<label for="phone">Phone</label>
				<sf:input type="text" class="form-control" id="phone" path="phone" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="fax">Fax</label>
				<sf:input type="text" class="form-control" id="fax" path="fax" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="telx">Telx</label>
				<sf:input type="text" class="form-control" id="telx" path="telx" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="stdTime">Std Time</label>
				<sf:input type="date" class="form-control" id="stdTime"
					path="stdTime" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="osec">Osec</label>
				<sf:input type="text" class="form-control" id="osec" path="osec" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="rbagHub">Rbag Hub</label>
				<sf:input type="text" class="form-control" id="rbagHub"
					path="rbagHub" />
			</div>

		</div>

		<button class="btn btn-primary" id="submit" type="submit">Submit</button>
	</sf:form>
</div>
