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
		<li class="breadcrumb-item active">Book Info</li>
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
				<sf:input type="date" class="form-control" id="bkgDate"
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
				<sf:input type="number" class="form-control" id="bookWt"
					path="bookWt" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="actualWt">Actual Wt</label>
				<sf:input type="number" class="form-control" id="actualWt"
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
				<sf:input type="number" class="form-control" id="outServiceCharges"
					path="outServiceCharges" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="handlingCharges">Handling Charges</label>
				<sf:input type="number" class="form-control" id="handlingCharges"
					path="handlingCharges" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="otherCharges">Other Charges</label>
				<sf:input type="number" class="form-control" id="otherCharges"
					path="otherCharges" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="amount">Amount</label>
				<sf:input type="number" class="form-control" id="amount"
					path="amount" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="partnerComm">Partner Commission</label>
				<sf:input type="number" class="form-control" id="partnerComm"
					path="partnerComm" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="partComm">Part Commission</label>
				<sf:input type="number" class="form-control" id="partComm"
					path="partComm" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="amountCal">Amount Calculation</label>
				<sf:input type="number" class="form-control" id="amountCal"
					path="amountCal" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="hndInstruction">HND Instruction</label>
				<sf:input type="text" class="form-control" id="hndInstruction"
					path="hndInstruction" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="gst">GST</label>
				<sf:input type="number" class="form-control" id="gst" path="gst" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="shipValue">Ship Value</label>
				<sf:input type="number" class="form-control" id="shipValue"
					path="shipValue" />
			</div>
		</div>


		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="insuranceCharges">Insurance Charges</label>
				<sf:input type="number" class="form-control" id="insuranceCharges"
					path="insuranceCharges" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="Routecode">Route Code</label>
				<sf:input type="text" class="form-control" id="Routecode"
					path="Routecode" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="userid">User ID</label>
				<sf:input type="text" class="form-control" id="userid" path="userid" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="sysId">SYS ID</label>
				<sf:input type="text" class="form-control" id="sysId" path="sysId" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="discountShip">Discount Ship</label>
				<sf:input type="number" class="form-control" id="discountShip"
					path="discountShip" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="discountBott">Discount Bott</label>
				<sf:input type="number" class="form-control" id="discountBott"
					path="discountBott" />
			</div>
		</div>


		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="discountFreq">Discount Freq</label>
				<sf:input type="number" class="form-control" id="discountFreq"
					path="discountFreq" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="incremenAmount">Incen Amount</label>
				<sf:input type="number" class="form-control" id="incremenAmount"
					path="incremenAmount" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="createDatetime">Create Date Time</label>
				<sf:input type="date" class="form-control" id="createDatetime"
					path="createDatetime" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="scanStat2">Scan Stat 2</label>
				<sf:input type="text" class="form-control" id="scanStat2"
					path="scanStat2" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="scanDate">Scan Date</label>
				<sf:input type="date" class="form-control" id="scanDate"
					path="scanDate" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="rptDate">RPT Date</label>
				<sf:input type="date" class="form-control" id="rptDate"
					path="rptDate" />
			</div>
		</div>



		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="eodStatus">EOD Status</label>
				<sf:input type="text" class="form-control" id="eodStatus"
					path="eodStatus" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="billStatus">Bill Status</label>
				<sf:input type="text" class="form-control" id="billStatus"
					path="billStatus" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="incStatus">Inc Status</label>
				<sf:input type="text" class="form-control" id="incStatus"
					path="incStatus" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="cutOfDate">Cut Of Date</label>
				<sf:input type="date" class="form-control" id="cutOfDate"
					path="cutOfDate" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="userId">User ID</label>
				<sf:input type="text" class="form-control" id="userId" path="userId" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="discount">Discount</label>
				<sf:input type="text" class="form-control" id="discount"
					path="discount" />
			</div>
		</div>


		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="discountUnit">Discount Unit</label>
				<sf:input type="number" class="form-control" id="discountUnit"
					path="discountUnit" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="discountWt">Discount Wt</label>
				<sf:input type="number" class="form-control" id="discountWt"
					path="discountWt" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="custRef">Cust Ref</label>
				<sf:input type="text" class="form-control" id="custRef"
					path="custRef" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="billCallDate">Bill Call Date</label>
				<sf:input type="text" class="form-control" id="billCallDate"
					path="billCallDate" />
			</div>

		</div>
<button class="btn btn-primary" id="submit" type="submit">Submit</button>
	</sf:form>
</div>