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
	<form action="${contextRoot}/book-info" method="POST">
		<div class="form-row">
			<div class="col-md-1 mb-3">
				<b><label for="awbNo">Cust Key</label></b> 
				</div>
				<div class="col-md-3 mb-3">
				<input type="text"
					class="form-control" id="awbNo" name="awbNo" />
			</div>
			<div class="col-md-4 mb-3"></div>
			<div class="col-md-2 mb-3">
				<label for="bkgDate">Booking Date</label> 
				</div>
				<div class="col-md-2 mb-3">
				<input type="date"
					class="form-control" id="bkgDate" name="bkgDate" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="shipType">Product</label> <select
					class="form-control" id="shipType" name="shipType"></select>
			</div>
			<div class="col-md-3 mb-3">
				<label for="productId">Consignment No</label> <input type="text"
					class="form-control" id="productId" name="productId" />
			</div>
			<div class="col-md-1 mb-3">
				<label for="serviceNo">Origin</label> <input type="text"
					class="form-control" id="serviceNo" name="serviceNo" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="serviceNo">Destination</label> <select
					class="form-control" id="shipType" name="shipType"></select>
			</div>
			<div class="col-md-2 mb-3">
				<label for="serviceNo"> </label> <input type="text"
					class="form-control" id="serviceNo" name="serviceNo" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="sectorId">Service Type</label> <select
					class="form-control" id="shipType" name="shipType"></select>
			</div>
		</div>
		<hr>
		<div class="form-row">
			<div class="col-md-5 mb-3">
				<b><label for="payId">Shipper Information</label></b> <select
					class="form-control" id="payId" name="payId">
					<option selected="selected">Search By Phone</option></select>
			</div>
			<div class="col-md-2 mb-3"></div>
			<div class="col-md-5 mb-3">
				<b><label for="empId">Consignee Information</label></b>
					<select class="form-control" id="empId" name="empId">
					<option selected="selected">Search By Phone</option></select>
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="origin">Person Name</label>
			</div>
			<div class="col-md-3 mb-3"> <input type="text"
					class="form-control" id="origin" name="origin" />
			</div>
			<div class="col-md-2 mb-3"></div>
			<div class="col-md-2 mb-3">
				<label for="destination">Person Name</label>
			</div>
			<div class="col-md-3 mb-3"> <input type="text"
					class="form-control" id="destination" name="destination" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="origin">Company</label>
			</div>
			<div class="col-md-3 mb-3"> <input type="text"
					class="form-control" id="origin" name="origin" />
			</div>
			<div class="col-md-2 mb-3"></div>
			<div class="col-md-2 mb-3">
				<label for="destination">Company</label>
			</div>
			<div class="col-md-3 mb-3"> <input type="text"
					class="form-control" id="destination" name="destination" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="origin">Address Detail</label> 
			</div>
			<div class="col-md-3 mb-3"> <textarea type="text"
					class="form-control" id="origin" name="origin"></textarea>
			</div>
			<div class="col-md-2 mb-3"></div>
			<div class="col-md-2 mb-3">
				<label for="origin">Address Detail</label> 
			</div>
			<div class="col-md-3 mb-3"> <textarea type="text"
					class="form-control" id="origin" name="origin"></textarea>
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="origin">Phone/Mobile</label>
			</div>
			<div class="col-md-3 mb-3"> <input type="text"
					class="form-control" id="origin" name="origin" />
			</div>
			<div class="col-md-2 mb-3"></div>
			<div class="col-md-2 mb-3">
				<label for="destination">Phone/Mobile</label>
			</div>
			<div class="col-md-3 mb-3"> <input type="text"
					class="form-control" id="destination" name="destination" />
			</div>
		</div>
		<hr>
		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="actualWt">Payment Mode</label> <select
					class="form-control" id="actualWt" name="actualWt"></select>
			</div>
			<div class="col-md-2 mb-3"></div>
			<div class="col-md-2 mb-3">
				<label for="outServiceCharges">Service Amount</label> <input
					type="number" class="form-control" id="outServiceCharges"
					name="outServiceCharges" />
			</div>
			<div class="col-md-2 mb-3"></div>
			<div class="col-md-2 mb-3">
				<label for="handlingCharges">Gst</label> <input
					type="number" class="form-control" id="handlingCharges"
					name="handlingCharges" />
			</div>
		</div>


		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="actualWt">No Of Pieces</label> <input
					type="number" class="form-control" id="outServiceCharges"
					name="outServiceCharges" />
			</div>
			<div class="col-md-2 mb-3"></div>
			<div class="col-md-2 mb-3">
				<label for="outServiceCharges">Handling Amount</label> <input
					type="number" class="form-control" id="outServiceCharges"
					name="outServiceCharges" />
			</div>
			<div class="col-md-2 mb-3"></div>
			<div class="col-md-2 mb-3">
				<label for="handlingCharges">P.E.D</label> <input
					type="number" class="form-control" id="handlingCharges"
					name="handlingCharges" />
			</div>
		</div>


		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="actualWt">Dimensions</label> <input
					type="number" class="form-control" id="outServiceCharges"
					name="outServiceCharges" />
			</div>
			<div class="col-md-2 mb-3"></div>
			<div class="col-md-2 mb-3">
				<label for="outServiceCharges">Partner Amount</label> <input
					type="number" class="form-control" id="outServiceCharges"
					name="outServiceCharges" />
			</div>
			<div class="col-md-2 mb-3"></div>
			<div class="col-md-2 mb-3">
				<label for="handlingCharges">Octroi</label> <input
					type="number" class="form-control" id="handlingCharges"
					name="handlingCharges" />
			</div>
		</div>

		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="actualWt">Chargeable Wtt</label><input
					type="number" class="form-control" id="outServiceCharges"
					name="outServiceCharges" />
			</div>
			<div class="col-md-2 mb-3"></div>
			<div class="col-md-2 mb-3">
				<label for="outServiceCharges">OTS Amount</label> <input
					type="number" class="form-control" id="outServiceCharges"
					name="outServiceCharges" />
			</div>
			<div class="col-md-2 mb-3"></div>
			<div class="col-md-2 mb-3">
				<label for="handlingCharges">Fuel Charges</label> <input
					type="number" class="form-control" id="handlingCharges"
					name="handlingCharges" />
			</div>
		</div>

		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="actualWt">Handling Instructions</label> <select
					class="form-control" id="actualWt" name="actualWt"></select>
			</div>
			<div class="col-md-2 mb-3"></div>
			<div class="col-md-2 mb-3">
				<label for="outServiceCharges">Other Amount</label> <input
					type="number" class="form-control" id="outServiceCharges"
					name="outServiceCharges" />
			</div>
			<div class="col-md-2 mb-3"></div>
			<div class="col-md-2 mb-3">
				<label for="handlingCharges">Ins. Premium</label> <input
					type="number" class="form-control" id="handlingCharges"
					name="handlingCharges" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="actualWt">Insurance Item Type</label> <select
					class="form-control" id="actualWt" name="actualWt"></select>
			</div>
			<div class="col-md-2 mb-3"></div>
			<div class="col-md-2 mb-3">
				<label for="outServiceCharges">Partner Comm</label> <input
					type="number" class="form-control" id="outServiceCharges"
					name="outServiceCharges" />
			</div>
			<div class="col-md-2 mb-3"></div>
			<div class="col-md-2 mb-3">
				<label for="handlingCharges">Custom Fees</label> <input
					type="number" class="form-control" id="handlingCharges"
					name="handlingCharges" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="actualWt">Insr. Declare Value</label> <select
					class="form-control" id="actualWt" name="actualWt"></select>
			</div>
			<div class="col-md-2 mb-3"></div>
			<div class="col-md-2 mb-3">
				<label for="outServiceCharges">Disc Shipment</label> <input
					type="number" class="form-control" id="outServiceCharges"
					name="outServiceCharges" />
			</div>
			<div class="col-md-2 mb-3"></div>
			<div class="col-md-2 mb-3">
				<label for="handlingCharges">Total Payable</label> <input
					type="number" class="form-control" id="handlingCharges"
					name="handlingCharges" />
			</div>
		</div>
		<button class="btn btn-primary" id="submit" type="submit">Submit</button>
	</form>
</div>