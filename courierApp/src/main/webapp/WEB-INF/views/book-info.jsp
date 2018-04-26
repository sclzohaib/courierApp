<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<div class="container">
	<ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
		<li class="breadcrumb-item active">Forms</li>
		<li class="breadcrumb-item active">Book Info</li>
	</ol>
	<sf:form modelAttribute="bookInfo" action="${contextRoot}/book-info"
		method="POST">
		<div class="form-row">
			<div class="col-md-1 mb-3">
				<b><label>Cust Key</label></b>
			</div>
			<div class="col-md-3 mb-3">
				<sf:input type="text" class="form-control" id="custKey"
					path="custKey" />
			</div>
			<div class="col-md-4 mb-3"></div>
			<div class="col-md-2 mb-3">
				<label>Booking Date</label>
			</div>
			<div class="col-md-2 mb-3">
				<sf:input type="date" class="form-control" id="bkgDate"
					path="bkgDate" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label>Product</label>
				<sf:select class="form-control" path="productId" id="productId">
					<option value=0>--Select Product--</option>
					<sf:options items="${products}" itemLabel="description"
						itemValue="id" />
				</sf:select>
			</div>
			<div class="col-md-3 mb-3">
				<label>Consignment/AWB No</label>
				<sf:input type="text" min="0" class="form-control" id="cnsgNo"
					path="cnsgNo" />
			</div>
			<div class="col-md-1 mb-3">
				<label>Origin</label>
				<sf:input type="text" class="form-control" id="origin" path="origin"
					onkeydown="upperCaseF(this)" />
			</div>
			<script>
				function upperCaseF(a) {
					setTimeout(function() {
						a.value = a.value.toUpperCase();
					}, 1);
				}
			</script>
			<div class="col-md-2 mb-3">
				<label>Destination</label>
				<sf:select class="form-control" id="dest" path="dest">
					<option value=0>--Select City--</option>
					<sf:options items="${cities}" itemLabel="description"
						itemValue="cityNo" />
				</sf:select>

			</div>
			<div class="col-md-2 mb-3">
				<label> </label>
				<sf:input type="text" class="form-control" id="cityName"
					path="cityName" />
			</div>
			<div class="col-md-2 mb-3">
				<label>Service Type</label>
				<sf:select class="form-control" id="serviceType" path="serviceType">

					<option value=0>--Select Service Type--</option>
					<sf:options items="${services}" itemLabel="description"
						itemValue="serviceCode" />

				</sf:select>
			</div>
		</div>
		<hr>
		<div class="form-row">
			<div class="col-md-5 mb-3">
				<b><label>Shipper Information</label></b>
				<div class="input-group">

					<sf:input class="form-control" type="text" path="shipperInfo"
						id="shipperInfo" name="shipperInfo" />

					<div class="input-group-btn">
						<button type="button" class="iconbtn btn-success"
							data-toggle="modal" data-target="#myInfoModal">
							<i class="fa fa-plus"></i>
						</button>
					</div>
				</div>
				<div id="hint"></div>
			</div>
			<div class="col-md-2 mb-3"></div>
			<div class="col-md-5 mb-3">
				<b><label for="empId">Consignee Information</label></b>
				<div class="input-group">
					<sf:input type="text" class="form-control" id="cnsgInfo"
						path="cnsgInfo" name="cnsgInfo" />
					<div class="input-group-btn">
						<button type="button" class="iconbtn btn-success"
							data-toggle="modal" data-target="#myInfoModal">
							<i class="fa fa-plus"></i>
						</button>
					</div>
				</div>
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label>Person Name</label>
			</div>
			<div class="col-md-3 mb-3">
				<sf:input type="text" class="form-control" id="shipperName"
					name="shipperName" path="shipperName" />
			</div>
			<div class="col-md-2 mb-3"></div>
			<div class="col-md-2 mb-3">
				<label>Person Name</label>
			</div>
			<div class="col-md-3 mb-3">
				<sf:input type="text" class="form-control" id="cnsgName"
					path="cnsgName" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label>Company</label>
			</div>
			<div class="col-md-3 mb-3">
				<sf:input type="text" class="form-control" id="shipperCompany"
					path="shipperCompany" />
			</div>
			<div class="col-md-2 mb-3"></div>
			<div class="col-md-2 mb-3">
				<label>Company</label>
			</div>
			<div class="col-md-3 mb-3">
				<sf:input type="text" class="form-control" id="cnsgCompany"
					path="cnsgCompany" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label>Address Detail</label>
			</div>
			<div class="col-md-3 mb-3">
				<sf:textarea class="form-control" id="shipperAddress"
					path="shipperAddress"></sf:textarea>
			</div>
			<div class="col-md-2 mb-3"></div>
			<div class="col-md-2 mb-3">
				<label>Address Detail</label>
			</div>
			<div class="col-md-3 mb-3">
				<sf:textarea class="form-control" id="cnsgAddress"
					path="cnsgAddress"></sf:textarea>
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label>Phone/Mobile</label>
			</div>
			<div class="col-md-3 mb-3">
				<sf:input type="text" class="form-control" id="shipperPhone"
					path="shipperPhone" />
			</div>
			<div class="col-md-2 mb-3"></div>
			<div class="col-md-2 mb-3">
				<label>Phone/Mobile</label>
			</div>
			<div class="col-md-3 mb-3">
				<sf:input type="text" class="form-control" id="cnsgPhone"
					path="cnsgPhone" />
			</div>
		</div>
		<hr>
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label>Payment Mode</label>
			</div>
			<div class="col-md-3 mb-3">
				<sf:select class="form-control" id="paymentMode" path="paymentMode">

					<option value=0>--Select Payment Mode--</option>
					<sf:options items="${paymentModes}" itemLabel="description"
						itemValue="payCode" />

				</sf:select>
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
				<sf:input type="number" class="form-control" id="gst" path="gst" />
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
				<sf:input type="number" class="form-control" id="ped" path="ped" />
			</div>
		</div>


		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label>Dimensions (kg)</label>
			</div>
			<div class="col-md-3 mb-3">
				<div class="input-group">
					<sf:input type="number" class="form-control" id="dimensions"
						name="dimensions" path="dimensions" min="0" step="any" />
					<div class="input-group-btn">
						<button type="button" class="iconbtn btn-success"
							data-toggle="modal" data-target="#myDimensionModal">
							<i class="fa fa-plus"></i>
						</button>
					</div>
				</div>
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
				<sf:select class="form-control" id="hanlingInstr"
					path="hanlingInstr"></sf:select>
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
				<sf:select class="form-control" id="insDeclareValue"
					path="insDeclareValue"></sf:select>
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
				<sf:input type="number" class="form-control" id="total" path="total" />
			</div>
		</div>
		<button class="btn btn-primary" id="submit" type="submit">Submit</button>
	</sf:form>
	<div class="modal fade" id="myInfoModal" role="dialog">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<!-- Modal header -->
				<div class="modal-header">

					<h4 class="modal-title">Add Information</h4>
					<button type="button" class="close" data-dismiss="modal">
						<span>&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<!--Category Form -->

				</div>
			</div>
		</div>
	</div>
	<div class="modal fade" id="myDimensionModal" role="dialog">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<!-- Modal header -->
				<div class="modal-header">

					<h4 class="modal-title">Dimensions</h4>
					<button type="button" class="close" data-dismiss="modal">
						<span>&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<div class="container">
						<!--Category Form -->
						<div class="form-row text-center">
							<div class="col-md-3 mb-3">
								<label>Length (cm)</label>
							</div>
							<div class="col-md-6 mb-3">
								<input type="number" class="form-control" id="length"
									name="length" />
							</div>
						</div>
						<div class="form-row text-center">
							<div class="col-md-3 mb-3">
								<label>Width (cm)</label>
							</div>
							<!-- (Length x Width x Height) / 5000 -->
							<div class="col-md-6 mb-3">
								<input type="number" class="form-control" id="width"
									name="width" />
							</div>
						</div>
						<div class="form-row text-center">
							<div class="col-md-3 mb-3">
								<label>Height (cm)</label>
							</div>
							<div class="col-md-6 mb-3">
								<input type="number" class="form-control" id="height"
									name="height" />
							</div>
						</div>
						<div class="form-row">
							<div class="col-md-3 mb-3"></div>
							<div class="col-md-6 mb-3">
								<button type="button" id="btnSave" class="form-control btn-success">Calculate</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>