<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<div class="container">
	<ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a>
		</li>
		<li class="breadcrumb-item active">Forms</li>
		<li class="breadcrumb-item active">Delivery</li>
	</ol>
	<form action="${contextRoot}/delivery" method="POST">
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label>Sheet #</label> <input type="number" class="form-control"
					name="sheetNo" id="sheetNo" />
			</div>

			<div class="col-md-1 mb-3">
				<label>Route</label> <input class="form-control" id="route"
					name="route" />
			</div>
			<div class="col-md-2 mb-3">
				<label> </label> <select class="form-control" id="route"
					name="route">
					<option value=0>-- Select Route --</option>
				</select>
			</div>

			<div class="col-md-1 mb-3">
				<label>Transport</label> <input class="form-control" id="route"
					name="route" />
			</div>
			<div class="col-md-2 mb-3">
				<label> </label> <select class="form-control" id="transport"
					name="transport">
					<option value=0>-- Select Transport --</option>
				</select>
			</div>

			<div class="col-md-1 mb-3">
				<label>Product</label> <input class="form-control" id="route"
					name="route" />
			</div>
			<div class="col-md-2 mb-3">
				<label> </label> <select class="form-control" id="product"
					name="product">
					<option value=0>-- Select Product --</option>
				</select>
			</div>
		</div>
		<div class="form-row">
			<div class="col-sm-2 mb-3">
				<label>Dlv Date</label> <input type="date" class="form-control"
					name="delDate" id="delDate" />
			</div>
			<div class="col-md-1 mb-3">
				<label>Courier</label> <input type="number" class="form-control"
					id="courier" name="courier" />
			</div>
			<div class="col-md-2 mb-3">
				<label> </label> <input type="number" class="form-control"
					id="courier" name="courier" />
			</div>
			<div class="col-md-1 mb-3">
				<label>Station</label> <input type="number" class="form-control"
					id="courier" name="courier" />
			</div>
			<div class="col-md-2 mb-3">
				<label> </label> <input type="text" class="form-control"
					id="station" name="station" />
			</div>
			<div class="col-md-1 mb-3">
				<label>Slot</label> <input type="number" class="form-control"
					id="courier" name="courier" />
			</div>
			<div class="col-sm-1 mb-3">
				<label>Sht Type</label> <input type="number" class="form-control"
					id="courier" name="courier" />
			</div>
		</div>
	</form>
	<div class="row clearfix">
		<div class="col-md-11 column">
			<table class="table" id="tab_logic">
				<thead>
					<tr>
						<th style="width:2%">Sr#</th>
						<th style="width:7%">Pg#</th>
						<th style="width:10%">Consign#</th>
						<th style="width:15%">Consignee</th>
						<th style="width:10%">Origin</th>
						<th style="width:7%">Pcs</th>
						<th style="width:10%">Rec. By</th>
						<th style="width:10%">Time</th>
						<th style="width:7%">Status</th>
						<th style="width:7%">OTS</th>
						<th style="width:7%">COD</th>
						<th style="width:7%">HO</th>
				</thead>
				<tbody>
					<tr id='addr0'>
						<td>1</td>
						<td><input type="text" name='mobile0'
							class="form-control" /></td>
						<td><input type="text" name='name0'
							class="form-control " /></td>
						<td><input type="text" name='mail0'
							class="form-control" /></td>
						<td><input type="text" name='mobile0'
							class="form-control" /></td>
							<td><input type="text" name='mobile0'
							class="form-control" /></td>
						<td><input type="text" name='name0'
							class="form-control" /></td>
						<td><input type="text" name='mail0'
							class="form-control" /></td>
						<td><input type="text" name='mobile0'
							class="form-control" /></td>
							
						<td><input type="text" name='name0'
							class="form-control" /></td>
						<td><input type="text" name='mail0'
							class="form-control" /></td>
						<td><input type="text" name='mobile0'
							class="form-control" /></td>
					</tr>
					<tr id='addr1'></tr>
				</tbody>
			</table>
		</div>
		<div class="column text-right">
		<div>
			<button id="add_row" type="button" class="iconbtn btn-success">
				<i class="fa fa-plus"></i>
			</button>
			</div>
			<hr>
			<div>
			<button id='delete_row' type="button" class="iconbtn btn-danger">
				<i class="fa fa-minus"></i>
			</button>
			</div>
		</div>
	</div>
	<div class="text-center">
	<button class="btns" style="width:100px">Previous</button>
	<button class="btns" style="width:120px">Page Up</button>
	<button class="btns" style="width:100px">Submit</button>
	<button class="btns" style="width:120px">Page Down</button>
	<button class="btns" style="width:100px">Next</button>
	</div>
	<div class="text-center">
	<button class="btns" style="width:100px">Serial</button>
	<button class="btns" style="width:100px">Clear</button>
	<button class="btns" style="width:100px">Print</button>
	<button class="btns" style="width:100px">Exit</button>
	</div>
	<!-- Form end -->

</div>