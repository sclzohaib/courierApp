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
		<li class="breadcrumb-item active">Rate Card</li>
	</ol>
	<sf:form modelAttribute="rateCard" action="${contextRoot}/rate-card"
		method="POST">

		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="payId">Pay Id</label>
				<sf:input type="text" class="form-control" id="payId" path="payId" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="productID">Product Id</label>
				<sf:input type="text" class="form-control" id="productID" path="productID" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="SECTORiD">Sector Id</label>
				<sf:input type="text" class="form-control" id="SECTORiD"
					path="SECTORiD" />
			</div>
		</div>

		<div class="form-row">

			<div class="col-md-3 mb-3">
				<label for="serviceCode">Service Code</label>
				<sf:input type="text" class="form-control" id="serviceCode"
					path="serviceCode" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="startDate">Start Date</label>
				<sf:input type="date" class="form-control" id="startDate"
					path="startDate" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="endDate">End Date</label>
				<div class="input-group">
					<sf:input type="date" class="form-control" id="endDate"
						path="endDate"/>
				</div>
			</div>
			</div>
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="wttLowerLmt">WTT Lower Limit</label>
				<sf:input type="number" class="form-control" id="wttLowerLmt"
					path="wttLowerLmt" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="wttUpperLmt">WTT Upper Limit</label>
				<sf:input type="number" class="form-control" id="wttUpperLmt" path="wttUpperLmt" />
			</div>
		

			<div class="col-md-2 mb-3">
				<label for="divFac">Div Fac</label>
				<sf:input type="number" class="form-control" id="divFac"
					path="divFac" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="charges">Charges</label>
				<div class="input-group">
					<sf:input type="number" class="form-control" id="charges"
						path="charges"/>
				</div>
			</div></div>
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="adCharges">Addtional Charges</label>
				<div class="input-group">
					<sf:input type="number" class="form-control" id="adCharges"
						path="adCharges"/>
				</div>
			</div>
		
			<div class="col-md-2 mb-3">
				<label for="handlingCharges">Hanlding Charges</label>
				<sf:input type="number" class="form-control" id="handlingCharges" path="handlingCharges" />
			</div>
			<div class="col-md-2 mb-3">			
				<label for="otherCharges">Other Charges</label>
				<div class="input-group">
					<sf:input type="number" class="form-control" id="otherCharges"
						path="otherCharges" />
				</div>
			</div>
		</div>
		<div class="form-row">

			<div class="col-md-3 mb-3">
				<label for="remarks">Remarks</label>
				<div class="input-group">
					<sf:input type="text" class="form-control" id="remarks"
						path="remarks"/>
				</div>
			</div>
			<div class="col-md-3 mb-3">
				<label for="approvalAuth">Approval Auth</label>
				<sf:input type="text" class="form-control" id="approvalAuth" path="approvalAuth" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="updatedBy">Updated By</label>
				<div class="input-group">
					<sf:input type="text" class="form-control" id="updatedBy"
						path="updatedBy" />
				</div>
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="empId">Employee Id</label>
				<sf:input type="text" class="form-control" id="empId" path="empId" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="stat">Stat</label>
				<div class="input-group">
					<sf:input type="text" class="form-control" id="stat"
						path="stat" />
				</div>
			</div>
			<div class="col-md-3 mb-3">
				<label for="tarrifYear">Tarrif Year</label>
				<div class="input-group">
					<sf:input type="text" class="form-control" id="tarrifYear"
						path="tarrifYear" />
				</div>
			</div>
		</div>
		<button class="btn btn-primary" type="submit">Submit form</button>
		<!-- Form end -->
	</sf:form>
</div>