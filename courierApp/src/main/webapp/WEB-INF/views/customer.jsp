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
		<li class="breadcrumb-item active">Customer</li>
	</ol>
	<sf:form modelAttribute="customer" action="${contextRoot}/customer"
		method="POST">
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="customerID">Customer ID</label>
				<sf:input type="text" class="form-control" id="customerID"
					path="customerID" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="indNo">Index No</label>
				<sf:input type="text" class="form-control" id="indNo" path="indNo" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="registrationDate">Registration Date</label>
				<sf:input type="text" class="form-control" id="registrationDate"
					path="registrationDate" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="closeDate">Close Date</label>
				<sf:input type="text" class="form-control" id="closeDate"
					path="closeDate" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="expiredDate">Expiry Date</label>
				<sf:input type="text" class="form-control" id="expiredDate"
					path="expiredDate" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="accFee">Account Fee</label>
				<sf:input type="text" class="form-control" id="accFee" path="accFee" />
			</div>
		</div>

		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="serviceCharges">Service Charges</label>
				<sf:input type="text" class="form-control" id="serviceCharges"
					path="serviceCharges" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="recTerId">Rec Ter ID</label>
				<sf:input type="text" class="form-control" id="recTerId"
					path="recTerId" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="feeFlag">Fee Flag</label>
				<sf:input type="text" class="form-control" id="feeFlag"
					path="feeFlag" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="billingStatus">Billing Status</label>
				<sf:input type="text" class="form-control" id="billingStatus"
					path="billingStatus" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="pinNO">Pin No</label>
				<sf:input type="text" class="form-control" id="pinNO" path="pinNO" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="stat">Stat</label>
				<sf:input type="text" class="form-control" id="stat" path="stat" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="billingCust">Billing Customer</label>
				<sf:input type="text" class="form-control" id="billingCust"
					path="billingCust" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="trtyCode">Trty Code</label>
				<div class="input-group">
					<sf:input type="text" class="form-control" id="trtyCode"
						path="trtyCode" />
				</div>
			</div>
			<div class="col-md-2 mb-3">
				<label for="handlingExempt">Handling Exempt</label>
				<sf:input type="text" class="form-control" id="handlingExempt"
					path="handlingExempt" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="trfYear">Trf Year</label>
				<sf:input type="text" class="form-control" id="trfYear"
					path="trfYear" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="bankCode">Bank Code</label>
				<sf:input type="text" class="form-control" id="bankCode"
					path="bankCode" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="employeeId">Employee</label>
				<sf:input type="text" class="form-control" id="employeeId"
					path="employeeId" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="octroiExempt">Octroi Exempt</label>
				<sf:input type="text" class="form-control" id="octroiExempt"
					path="octroiExempt" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="cusGst">Customer GST</label>
				<sf:input type="text" class="form-control" id="cusGst" path="cusGst" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="discountFlag">Discount Flag</label>
				<sf:input type="text" class="form-control" id="discountFlag"
					path="discountFlag" />
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
				<label for="designation">Designation</label>
				<sf:input type="text" class="form-control" id="designation"
					path="designation" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="intAddess">Int Address</label>
				<sf:input type="text" class="form-control" id="intAddess"
					path="intAddess" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="customerId2">Customer 2</label>
				<sf:input type="text" class="form-control" id="customerId2"
					path="customerId2" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="contPer">Cont Per</label>
				<sf:input type="text" class="form-control" id="contPer"
					path="contPer" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="customerName">Customer Name</label>
				<sf:input type="text" class="form-control" id="customerName"
					path="customerName" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="pcusNo">PCustomer No</label>
				<sf:input type="text" class="form-control" id="pcusNo" path="pcusNo" />
			</div>
		</div>


		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="creditAmountLimit">Credit Amount Limit</label>
				<sf:input type="text" class="form-control" id="creditAmountLimit"
					path="creditAmountLimit" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="invTypeNo">Inv Type No</label>
				<sf:input type="text" class="form-control" id="invTypeNo"
					path="invTypeNo" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="discountBott">Discount Bott</label>
				<sf:input type="date" class="form-control" id="discountBott"
					path="discountBott" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="creditDays">Credit Days</label>
				<sf:input type="text" class="form-control" id="creditDays"
					path="creditDays" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="creditDaysLimit">Credit Days Limit</label>
				<sf:input type="text" class="form-control" id="creditDaysLimit"
					path="creditDaysLimit" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="cityNo">City</label>
				<sf:input type="text" class="form-control" id="cityNo" path="cityNo" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="employeeId2">Employee 2</label>
				<sf:input type="text" class="form-control" id="employeeId2"
					path="employeeId2" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="routeNo">Route</label>
				<sf:input type="text" class="form-control" id="routeNo"
					path="routeNo" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="customerProduct">Customer Product</label>
				<sf:input type="date" class="form-control" id="customerProduct"
					path="customerProduct" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="billCycNo">Bill Cys No</label>
				<sf:input type="text" class="form-control" id="billCycNo"
					path="billCycNo" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="customerCash">Customer Cash</label>
				<sf:input type="text" class="form-control" id="customerCash"
					path="customerCash" />
			</div>
		</div>


		<button class="btn btn-primary" id="submit" type="submit">Submit</button>
		<sf:hidden path="id" />
	</sf:form>
</div>