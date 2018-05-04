<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<div class="container">
	<ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a>
		</li>
		<li class="breadcrumb-item active">Forms</li>
		<li class="breadcrumb-item active">Delivery</li>
	</ol>
	<sf:form modelAttribute="delivery" action="${contextRoot}/delivery"
		method="POST">
		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label>Sheet #</label>
				<sf:input type="number" class="form-control" path="sheetNo"
					id="sheetNo" />
			</div>

			<div class="col-md-1 mb-3">
				<label>Route</label> <input type="number" class="form-control"/>
			</div>
			<div class="col-md-2 mb-3">
				<label> </label>
				<sf:select class="form-control" path="route" id="route">
					<option value=0>-- Select Route --</option>
					<sf:options items="${routes}" itemLabel="dscrp" itemValue="rutNo" />
				</sf:select>
			</div>

			<div class="col-md-1 mb-3">
				<label>Transport</label> <input type="number" class="form-control" />
			</div>
			<div class="col-md-2 mb-3">
				<label> </label>
				<sf:select class="form-control" id="transport" path="transport">
					<option value="">-- Select Transport --</option>
					<option value="road">By Road</option>
					<option value="air">By Air</option>
					<option value="train">By Train</option>
				</sf:select>
			</div>

			<div class="col-md-1 mb-3">
				<label>Product</label> <input type="number" class="form-control"/>
			</div>
			<div class="col-md-2 mb-3">
				<label> </label>
				<sf:select class="form-control" path="product" id="product">
					<option value=0>-- Select Product --</option>
					<sf:options items="${products}" itemLabel="description"
						itemValue="id" />
				</sf:select>
			</div>
		</div>
		<div class="form-row">
			<div class="col-sm-2 mb-3">
				<label>Dlv Date</label>
				<sf:input type="date" class="form-control" path="deliveryDate"
					id="deliveryDate" />
			</div>
			<div class="col-md-1 mb-3">
				<label>Courier</label> <input type="number" class="form-control"/>
			</div>
			<div class="col-md-2 mb-3">
				<label> </label>
				<sf:select class="form-control" path="courier" id="courier">
					<option value=0>-- Select Courier --</option>
					<sf:options items="${employees}" itemLabel="name" itemValue="id" />
				</sf:select>
			</div>
			<div class="col-md-1 mb-3">
				<label>Station</label> <input type="number" class="form-control"/>
			</div>
			<div class="col-md-2 mb-3">
				<label> </label>
				<sf:select class="form-control" id="station" path="station">
					<option value=0>-- Select Station --</option>
					<sf:options items="${cities}" itemLabel="description"
						itemValue="cityNo" />
				</sf:select>
			</div>
			<div class="col-md-1 mb-3">
				<label>Slot</label>
				<sf:input type="text" class="form-control" id="slot" path="slot" />
			</div>
			<div class="col-sm-2 mb-3">
				<label>Sht Type</label>
				<sf:select class="form-control" id="sheetType" path="sheetType">
					<option value="">-- Select Sheet Type --</option>
					<option value="Sheet Type 1">Sheet Type 1</option>
					<option value="Sheet Type 2">Sheet Type 2</option>
					<option value="Sheet Type 3">Sheet Type 3</option>
				</sf:select>
			</div>
		</div>
	
	<div class="row clearfix">
		<div class="col-md-11 column">
			<table class="table" id="tab_logic">
				<thead>
					<tr>
						<th style="width: 2%">Sr#</th>
						<th style="width: 7%">Pg#</th>
						<th style="width: 10%">Consign#</th>
						<th style="width: 15%">Consignee</th>
						<th style="width: 10%">Origin</th>
						<th style="width: 7%">Pcs</th>
						<th style="width: 10%">Rec. By</th>
						<th style="width: 10%">Time</th>
						<th style="width: 7%">Status</th>
						<th style="width: 7%">OTS</th>
						<th style="width: 7%">COD</th>
						<th style="width: 7%">HO</th>
				</thead>
				<tbody>
					<tr id='addr0'>
						<td>1</td>
						<td><input type="text" name='pgNo' id='pgNo' class="form-control" /></td>
						<td><input type="text" name='consignNo' class="form-control " /></td>
						<td><input type="text" name='consignee' class="form-control" /></td>
						<td><input type="text" name='origin' class="form-control" /></td>
						<td><input type="text" name='pcs' class="form-control" /></td>
						<td><input type="text" name='recBy' class="form-control" /></td>
						<td><input type="text" name='time' class="form-control" /></td>
						<td><input type="text" name='status' class="form-control" /></td>

						<td><input type="text" name='ots' class="form-control" /></td>
						<td><input type="text" name='cod' class="form-control" /></td>
						<td><input type="text" name='ho' class="form-control" /></td>
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
		<button class="btns" style="width: 100px">Previous</button>
		<button class="btns" style="width: 120px">Page Up</button>
		<button type="submit" class="btns" style="width: 100px">Submit</button>
		<button class="btns" style="width: 120px">Page Down</button>
		<button class="btns" style="width: 100px">Next</button>
	</div>
	<div class="text-center">
		<button class="btns" style="width: 100px">Serial</button>
		<button class="btns" style="width: 100px">Clear</button>
		<button class="btns" style="width: 100px">Print</button>
		<button class="btns" style="width: 100px">Exit</button>
	</div>
	<!-- Form end -->
</sf:form>
</div>