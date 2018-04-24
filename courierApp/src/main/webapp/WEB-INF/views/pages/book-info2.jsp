<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<div class="container">
	<ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
		<li class="breadcrumb-item active">Forms</li>
		<li class="breadcrumb-item active">Book Info</li>
	</ol>
	<sf:form modelAttribute="bookInfo" action="${contextRoot}/book-info" method="POST">
		<div class="form-row">
			<div class="col-md-1 mb-3">
				<b><label>Cust Key</label></b>
			</div>
			<div class="col-md-3 mb-3">
				<sf:input type="text" class="form-control" id="custKey" path="custKey" />
			</div>
			<div class="col-md-4 mb-3"></div>
			<div class="col-md-2 mb-3">
				<label>Booking Date</label>
			</div>
			<div class="col-md-2 mb-3">
				<sf:input type="date" class="form-control" id="bkgDate" path="bkgDate" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label>Product</label> 
				<sf:select class="form-control" id="productId" path="productId"></sf:select>
			</div>
			<div class="col-md-3 mb-3">
				<label>Consignment No</label> 
				<sf:input type="number" class="form-control" id="bookDetail2.cnsgNo" path="bookDetail2.cnsgNo" />
			</div>
			<div class="col-md-1 mb-3">
				<label>Origin</label> 
				<sf:input type="text" class="form-control" id="origin" path="origin" />
			</div>
			<div class="col-md-2 mb-3">
				<label>Destination</label> 
				<sf:select class="form-control" id="dest" path="dest"></sf:select>
			</div>
			<div class="col-md-2 mb-3">
				<label> </label> 
				<sf:input type="text" class="form-control" id="cityName" path="cityName" />
			</div>
			<div class="col-md-2 mb-3">
				<label>Service Type</label> 
				<sf:select class="form-control" id="serviceType" path="serviceType"></sf:select>
			</div>
		</div>
		<hr>
		<div class="form-row">
			<div class="col-md-5 mb-3">
				<b><label>Shipper Information</label></b> 
				<sf:select class="form-control" id="bookDetail2.shipperInfo" path="bookDetail2.shipperInfo">
					<option selected="selected">Search By Phone</option>
				</sf:select>
			</div>
			<div class="col-md-2 mb-3"></div>
			<div class="col-md-5 mb-3">
				<b><label for="empId">Consignee Information</label></b> <sf:select
					class="form-control" id="bookDetail2.cnsgInfo" path="bookDetail2.cnsgInfo">
					<option selected="selected">Search By Phone</option>
				</sf:select>
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label>Person Name</label>
			</div>
			<div class="col-md-3 mb-3">
				<sf:input type="text" class="form-control" id="bookDetail2.shipperName" path="bookDetail2.shipperName" />
			</div>
			<div class="col-md-2 mb-3"></div>
			<div class="col-md-2 mb-3">
				<label>Person Name</label>
			</div>
			<div class="col-md-3 mb-3">
				<sf:input type="text" class="form-control" id="bookDetail2.cnsgName"
					path="bookDetail2.cnsgName" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label>Company</label>
			</div>
			<div class="col-md-3 mb-3">
				<sf:input type="text" class="form-control" id="bookDetail2.shipperCompany" path="bookDetail2.shipperCompany" />
			</div>
			<div class="col-md-2 mb-3"></div>
			<div class="col-md-2 mb-3">
				<label>Company</label>
			</div>
			<div class="col-md-3 mb-3">
				<sf:input type="text" class="form-control" id="bookDetail2.cnsgCompany"
					path="bookDetail2.cnsgCompany" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label>Address Detail</label>
			</div>
			<div class="col-md-3 mb-3">
				<sf:textarea class="form-control" id="bookDetail2.shipperAddress" path="bookDetail2.shipperAddress"></sf:textarea>
			</div>
			<div class="col-md-2 mb-3"></div>
			<div class="col-md-2 mb-3">
				<label>Address Detail</label>
			</div>
			<div class="col-md-3 mb-3">
				<sf:textarea class="form-control" id="bookDetail2.cnsgAddress" path="bookDetail2.cnsgAddress"></sf:textarea>
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label>Phone/Mobile</label>
			</div>
			<div class="col-md-3 mb-3">
				<sf:input type="text" class="form-control" id="bookDetail2.shipperPhone" path="bookDetail2.shipperPhone" />
			</div>
			<div class="col-md-2 mb-3"></div>
			<div class="col-md-2 mb-3">
				<label>Phone/Mobile</label>
			</div>
			<div class="col-md-3 mb-3">
				<sf:input type="text" class="form-control" id="bookDetail2.cnsgPhone"
					path="bookDetail2.cnsgPhone" />
			</div>
		</div>
		<hr>
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label>Payment Mode</label>
			</div>
			<div class="col-md-3 mb-3">
				<sf:select class="form-control" id="paymentMode" path="paymentMode"></sf:select>
			</div>
			<div class="col-md-2 mb-3">
				<label>Service Amount</label>
			</div>
			<div class="col-md-2 mb-3">
				<sf:input type="number" class="form-control" id="serviceAmount"
					path="serviceAmount" />
			</div>
			<div class="col-md-1 mb-3">
				<label>Gst</label>
			</div>
			<div class="col-md-2 mb-3">
				<sf:input type="number" class="form-control" id="gst"
					path="gst" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label>No Of Pieces</label>
			</div>
			<div class="col-md-3 mb-3">
				<sf:input type="number" class="form-control" id="noOfPcs"
					path="noOfPcs" />
			</div>
			<div class="col-md-2 mb-3">
				<label>Handling Amount</label>
			</div>
			<div class="col-md-2 mb-3">
				<sf:input type="number" class="form-control" id="handlingAmount"
					path="handlingAmount" />
			</div>
			<div class="col-md-1 mb-3">
				<label>P.E.D</label>
			</div>
			<div class="col-md-2 mb-3">
				<sf:input type="number" class="form-control" id="ped"
					path="ped" />
			</div>
		</div>


		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label>Dimensions</label>
			</div>
			<div class="col-md-3 mb-3">
				<sf:input type="number" class="form-control" id="dimensions"
					path="dimensions" />
			</div>
			<div class="col-md-2 mb-3">
				<label>Partner Amount</label>
			</div>
			<div class="col-md-2 mb-3">
				<sf:input type="number" class="form-control" id="partnerAmount"
					path="partnerAmount" />
			</div>
			<div class="col-md-1 mb-3">
				<label>Octroi</label>
			</div>
			<div class="col-md-2 mb-3">
				<sf:input type="number" class="form-control" id="octroi"
					path="octroi" />
			</div>
		</div>

		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label>Chargeable Wtt</label>
			</div>
			<div class="col-md-3 mb-3">
				<sf:input type="number" class="form-control" id="chargeableWtt"
					path="chargeableWtt" />
			</div>
			<div class="col-md-2 mb-3">
				<label>OTS Amount</label>
			</div>
			<div class="col-md-2 mb-3">
				<sf:input type="number" class="form-control" id="otsAmount"
					path="otsAmount" />
			</div>
			<div class="col-md-2 mb-3">
				<label>Fuel Charges</label>
			</div>
			<div class="col-md-1 mb-3">
				<sf:input type="number" class="form-control" id="fuelCharges"
					path="fuelCharges" />
			</div>
		</div>

		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label>Handling Instructions</label>
			</div>
			<div class="col-md-3 mb-3">
				<sf:select class="form-control" id="hanlingInstr" path="hanlingInstr"></sf:select>
			</div>
			<div class="col-md-2 mb-3">
				<label>Other Amount</label>
			</div>
			<div class="col-md-2 mb-3">
				<sf:input type="number" class="form-control" id="otherAmount"
					path="otherAmount" />
			</div>
			<div class="col-md-2 mb-3">
				<label>Ins. Premium</label>
			</div>
			<div class="col-md-1 mb-3">
				<sf:input type="number" class="form-control" id="insPremium"
					path="insPremium" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label>Insurance Item Type</label>
			</div>
			<div class="col-md-3 mb-3">
				<sf:select class="form-control" id="insItemType" path="insItemType"></sf:select>
			</div>
			<div class="col-md-2 mb-3">
				<label>Partner Comm</label>
			</div>
			<div class="col-md-2 mb-3">
				<sf:input type="number" class="form-control" id="partnerComm"
					path="partnerComm" />
			</div>
			<div class="col-md-2 mb-3">
				<label>Custom Fees</label>
			</div>
			<div class="col-md-1 mb-3">
				<sf:input type="number" class="form-control" id="customFees"
					path="customFees" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label>Insr. Declare Value</label>
			</div>
			<div class="col-md-3 mb-3">
				<sf:select class="form-control" id="insDeclareValue" path="insDeclareValue"></sf:select>
			</div>
			<div class="col-md-2 mb-3">
				<label>Disc Shipment</label>
			</div>
			<div class="col-md-2 mb-3">
				<sf:input type="number" class="form-control" id="discShipment"
					path="discShipment" />
			</div>
			<div class="col-md-2 mb-3">
				<label>Total Payable</label>
			</div>
			<div class="col-md-1 mb-3">
				<sf:input type="number" class="form-control" id="total"
					path="total" />
			</div>
		</div>
		<button class="btn btn-primary" id="submit" type="submit">Submit</button>
	</sf:form>
</div>