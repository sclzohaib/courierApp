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
		<li class="breadcrumb-item active">Info</li>
	</ol>
	<sf:form modelAttribute="bookInfo" action="${contextRoot}/book-info"
		method="POST">
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="awbNo">AWB No</label>
				<sf:input type="text" class="form-control" id="awbNo" path="awbNo" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="billRef">Bill Reference</label>
				<sf:input type="text" class="form-control" id="billRef"
					path="billRef" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="bkgDate">BKG Date</label>
				<sf:input type="text" class="form-control" id="bkgDate"
					path="bkgDate" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="customerId">Customer ID</label>
				<sf:input type="text" class="form-control" id="customerId"
					path="customerId" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="shipType">Ship Type</label>
				<sf:input type="text" class="form-control" id="shipType"
					path="shipType" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="productId">Product ID</label>
				<sf:input type="text" class="form-control" id="productId"
					path="productId" />
			</div>
		</div>

		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="serviceNo">Service No</label>
				<sf:input type="text" class="form-control" id="serviceNo"
					path="serviceNo" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="sectorId">Sector ID</label>
				<sf:input type="text" class="form-control" id="sectorId"
					path="sectorId" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="origin">Origin</label>
				<sf:input type="text" class="form-control" id="origin" path="origin" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="destination">Destination</label>
				<sf:input type="text" class="form-control" id="destination"
					path="destination" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="bookWt">Book Wt</label>
				<sf:input type="text" class="form-control" id="bookWt" path="bookWt" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="actualWt">Actual Wt</label>
				<sf:input type="text" class="form-control" id="actualWt"
					path="actualWt" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="payId">Pay ID</label>
				<sf:input type="text" class="form-control" id="payId" path="payId" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="empId">Employee ID</label>
				<div class="input-group">
					<sf:input type="text" class="form-control" id="empId" path="empId"
						aria-describedby="inputGroupPrepend3" />
				</div>
			</div>
			<div class="col-md-2 mb-3">
				<label for="outServiceCharges">Out Service Charges</label>
				<sf:input type="text" class="form-control" id="outServiceCharges"
					path="outServiceCharges" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="validationServer03">City</label>
				<sf:input type="text" class="form-control" id="city" path="city" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="validationServer03">City</label>
				<sf:input type="text" class="form-control" id="city" path="city" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="validationServer03">City</label>
				<sf:input type="text" class="form-control" id="city" path="city" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="validationServer03">City</label>
				<sf:input type="text" class="form-control" id="city" path="city" />
			</div>
		</div>
		<button class="btn btn-primary" id="submit" type="submit">Submit</button>
		<sf:hidden path="id" />
	</sf:form>
</div>