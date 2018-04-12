<div class="container">
	<h2>${title}</h2>
	<ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a>
		</li>
		<li class="breadcrumb-item active">Forms</li>
		<li class="breadcrumb-item active">Manifest</li>
	</ol>
	<form>
		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="validationServer01">Bag Number</label> <input
					type="text" class="form-control" id="validationServer01" required>
			</div>
			<div class="col-md-3 mb-3">
				<label for="validationServer02">Manifest Type</label> <input
					type="text" class="form-control" id="validationServer02" required>
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="validationServerUsername">Origin</label>
				<div class="input-group">
					<input type="text" class="form-control"
						id="validationServerUsername"
						aria-describedby="inputGroupPrepend3" required>
				</div>
			</div>
			<div class="col-md-3 mb-3">
				<label for="validationServer03">Destination</label> <input
					type="text" class="form-control" id="validationServer03" required>
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="validationServer04">Date</label> <input type="text"
					class="form-control" id="validationServer04" required>
			</div>
			<div class="col-md-3 mb-3">
				<label for="validationServer05">Vehicle Number</label> <input
					type="text" class="form-control" id="validationServer05" required>
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="validationServer03">Total Quantity</label> <input
					type="text" class="form-control" id="validationServer03" required>
			</div>
			<div class="col-md-3 mb-3">
				<label for="validationServer04">Total Weight</label> <input
					type="text" class="form-control" id="validationServer04" required>
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="validationServer05">Product</label> <input type="text"
					class="form-control" id="validationServer05" required>
			</div>
			<div class="col-md-3 mb-3">
				<label for="validationServer03">Employee</label> <input type="text"
					class="form-control" id="validationServer03" required>
			</div>
		</div>
		<button class="btn btn-primary" type="submit">Submit form</button>
	</form>
</div>