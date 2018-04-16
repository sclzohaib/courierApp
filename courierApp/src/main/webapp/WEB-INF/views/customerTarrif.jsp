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
		<li class="breadcrumb-item active">Setup</li>
		<li class="breadcrumb-item active">Customer Tarrif</li>
	</ol>
	<sf:form modelAttribute="customerTarrif" action="${contextRoot}/customer-tarrif"
		method="POST">
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="customerID">Customer ID</label>
				<sf:input type="text" class="form-control" id="customerID"
					path="customerID" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="productId">Product</label>
				<sf:input type="text" class="form-control" id="productId" path="productId" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="serviceCode">Service Code</label>
				<sf:input type="text" class="form-control" id="serviceCode"
					path="serviceCode" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="sectorId">Sector</label>
				<sf:input type="text" class="form-control" id="sectorId"
					path="sectorId" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="destination">Destination</label>
				<sf:input type="text" class="form-control" id="destination"
					path="destination" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="wttLowerLimit">Wtt Lower Limit</label>
				<sf:input type="number" class="form-control" id="wttLowerLimit" path="wttLowerLimit" />
			</div>
		</div>

		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="wttUpperLimit">Wtt Upper Limit</label>
				<sf:input type="number" class="form-control" id="wttUpperLimit"
					path="wttUpperLimit" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="divFac">Div Fac</label>
				<sf:input type="number" class="form-control" id="divFac"
					path="divFac" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="charges">Charges</label>
				<sf:input type="number" class="form-control" id="charges"
					path="charges" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="additionalCharges">Additional Charges</label>
				<sf:input type="number" class="form-control" id="additionalCharges"
					path="additionalCharges" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="handlingCharges">Handling Charges</label>
				<sf:input type="number" class="form-control" id="handlingCharges" path="handlingCharges" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="otherCharges">Other Charges</label>
				<sf:input type="number" class="form-control" id="otherCharges" path="otherCharges" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="startDate">Start Date</label>
				<sf:input type="date" class="form-control" id="startDate"
					path="startDate" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="endDate">End Date</label>
				<div class="input-group">
					<sf:input type="date" class="form-control" id="endDate"
						path="endDate" />
				</div>
			</div>
			<div class="col-md-2 mb-3">
				<label for="approvalAuth">Approval Auth</label>
				<sf:input type="text" class="form-control" id="approvalAuth"
					path="approvalAuth" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="updatedBy">Updated By</label>
				<sf:input type="text" class="form-control" id="updatedBy"
					path="updatedBy" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="employeeId">Employee</label>
				<sf:input type="text" class="form-control" id="employeeId"
					path="employeeId" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="stat">Stat</label>
				<sf:input type="text" class="form-control" id="stat"
					path="stat" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-6 mb-3">
				<label for="remarks">Remarks</label>
				<sf:input type="text" class="form-control" id="remarks"
					path="remarks" />
			</div>
		</div>
		<button class="btn btn-primary" id="submit" type="submit">Submit</button>
	</sf:form>
</div>