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
		<li class="breadcrumb-item active">Track</li>
	</ol>
	<sf:form modelAttribute="track" action="${contextRoot}/track"
		method="POST">
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="awbNo">AWB No</label>
				<sf:input type="text" class="form-control" id="awbNo" path="awbNo" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="secStat">Sec Stat</label>
				<sf:input type="text" class="form-control" id="secStat"
					path="secStat" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="secDate">SecDate</label>
				<sf:input type="date" class="form-control" id="secDate"
					path="secDate" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="reportDate">ReportDate</label>
				<sf:input type="date" class="form-control" id="reportDate"
					path="reportDate" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="outSrvArea">Out Srv Area</label>
				<sf:input type="text" class="form-control" id="outSrvArea"
					path="outSrvArea" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="routeCode">Route Code</label>
				<sf:input type="text" class="form-control" id="routeCode"
					path="routeCode" />
			</div>
		</div>

		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="createDateTime">Create Date Time</label>
				<sf:input type="date" class="form-control" id="createDateTime"
					path="createDateTime" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="bookTime">Book Time</label>
				<sf:input type="date" class="form-control" id="bookTime"
					path="bookTime" />
			</div>
			<div class="col-md-2 mb-3">
				<label for=codStatus>Cod Status</label>
				<sf:input type="text" class="form-control" id="codStatus"
					path="codStatus" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="handlingInstruction">Handling Instruction</label>
				<sf:input type="text" class="form-control" id="handlingInstruction"
					path="handlingInstruction" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="employeeId">EmployeeId</label>
				<sf:input type="text" class="form-control" id="employeeId"
					path="employeeId" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="tract7">Tract 7</label>
				<sf:input type="text" class="form-control" id="tract7" path="tract7" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="tract6">Tract 6</label>
				<sf:input type="text" class="form-control" id="tract6" path="tract6" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="tract5">Tract 5</label>
				<div class="input-group">
					<sf:input type="text" class="form-control" id="tract5"
						path="tract5" aria-describedby="inputGroupPrepend3" />
				</div>
			</div>
			<div class="col-md-2 mb-3">
				<label for="tract8">Tract 8</label>
				<sf:input type="text" class="form-control" id="tract8" path="tract8" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="misDwh">Mis Dwh</label>
				<sf:input type="text" class="form-control" id="misDwh" path="misDwh" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="batchNo">Batch No</label>
				<sf:input type="text" class="form-control" id="batchNo"
					path="batchNo" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="cnsgType">cnsg Type</label>
				<sf:input type="text" class="form-control" id="cnsgType"
					path="cnsgType" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="fwdDate">Fwd Date</label>
				<sf:input type="date" class="form-control" id="fwdDate"
					path="fwdDate" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="track4">Track 4</label>
				<sf:input type="text" class="form-control" id="track4" path="track4" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="track3">Track 3</label>
				<sf:input type="text" class="form-control" id="track3" path="track3" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="track1">Track 1</label>
				<sf:input type="text" class="form-control" id="track1" path="track1" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="track2">Track 2</label>
				<sf:input type="text" class="form-control" id="track2" path="track2" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="trackCallDate">Track Call Date</label>
				<sf:input type="date" class="form-control" id="trackCallDate"
					path="trackCallDate" />
			</div>
		</div>


		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="customerPhone">Customer Phone</label>
				<sf:input type="text" class="form-control" id="customerPhone"
					path="customerPhone" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="shipperAddress1">Shipper Address 1</label>
				<sf:input type="text" class="form-control" id="shipperAddress1"
					path="shipperAddress1" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="shipperAddress3">Shipper Address 3</label>
				<sf:input type="text" class="form-control" id="shipperAddress3"
					path="shipperAddress3" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="shipperAddress2">Shipper Address 2</label>
				<sf:input type="text" class="form-control" id="shipperAddress2"
					path="shipperAddress2" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="customerFax">Customer Fax</label>
				<sf:input type="text" class="form-control" id="customerFax"
					path="customerFax" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="bkgDate">Bkg Date</label>
				<sf:input type="date" class="form-control" id="bkgDate"
					path="bkgDate" />
			</div>
		</div>


		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="customerName">Customer Name</label>
				<sf:input type="text" class="form-control" id="customerName"
					path="customerName" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="consgName">Consg Name</label>
				<sf:input type="text" class="form-control" id="consgName"
					path="consgName" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="consgAddress1">Consg Address 1</label>
				<sf:input type="text" class="form-control" id="consgAddress1"
					path="consgAddress1" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="consgAddress2">Consg Address 2</label>
				<sf:input type="text" class="form-control" id="consgAddress2"
					path="consgAddress2" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="consgAddress3">Consg Address 3</label>
				<sf:input type="text" class="form-control" id="consgAddress3"
					path="consgAddress3" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="consgPhone">Consg Phone</label>
				<sf:input type="text" class="form-control" id="consgPhone"
					path="consgPhone" />
			</div>
		</div>



		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="consgFax">Consg Fax</label>
				<sf:input type="text" class="form-control" id="consgFax"
					path="consgFax" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="callNo">Call No</label>
				<sf:input type="text" class="form-control" id="callNo" path="callNo" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="customerId">Customer Id</label>
				<sf:input type="text" class="form-control" id="customerId"
					path="customerId" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="packCont">Pack Cont</label>
				<sf:input type="text" class="form-control" id="packCont"
					path="packCont" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="bookWeight">Book Weight</label>
				<sf:input type="number" class="form-control" id="bookWeight"
					path="bookWeight" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="destination">Destination</label>
				<sf:input type="text" class="form-control" id="destination"
					path="destination" />
			</div>
		</div>


		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="origin">Origin</label>
				<sf:input type="text" class="form-control" id="origin" path="origin" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="totalAmount">Total Amount</label>
				<sf:input type="number" class="form-control" id="totalAmount"
					path="totalAmount" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="actualWeight">Actual Weight</label>
				<sf:input type="number" class="form-control" id="actualWeight"
					path="actualWeight" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="outSrvCharges">Out Srv Charges</label>
				<sf:input type="number" class="form-control" id="outSrvCharges"
					path="outSrvCharges" />
			</div>

			<div class="col-md-2 mb-3">
				<label for="productId">Product Id</label>
				<sf:input type="text" class="form-control" id="productId"
					path="productId" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="serviceNo">Service No</label>
				<sf:input type="text" class="form-control" id="serviceNo"
					path="serviceNo" />
			</div>

			<div class="col-md-2 mb-3">
				<label for="noPcs">No Pcs</label>
				<sf:input type="text" class="form-control" id="noPcs" path="noPcs" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="transmStatus">Transm Status</label>
				<sf:input type="text" class="form-control" id="transmStatus"
					path="transmStatus" />
			</div>


			<div class="col-md-2 mb-3">
				<label for="transmDttm">Transm Dttm</label>
				<sf:input type="date" class="form-control" id="transmDttm"
					path="transmDttm" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="employeeId2">Employee Id 2</label>
				<sf:input type="text" class="form-control" id="employeeId2"
					path="employeeId2" />
			</div>


		</div>
		<button class="btn btn-primary" id="submit" type="submit">Submit</button>
	</sf:form>
</div>