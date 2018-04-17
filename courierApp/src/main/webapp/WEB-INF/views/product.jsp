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
		<li class="breadcrumb-item active">Product</li>
	</ol>
	<sf:form modelAttribute="product" action="${contextRoot}/product"
		method="POST">

		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="Id">ID</label>
				<sf:input type="text" class="form-control" id="Id" path="Id" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="description">Description</label>
				<sf:input type="text" class="form-control" id="description"
					path="description" />
			</div>
		</div>

		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="partFlag">Part Flag</label>
				<sf:input type="text" class="form-control" id="partFlag"
					path="partFlag" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="commPrct">Comm Prct</label>
				<sf:input type="number" class="form-control" id="commPrct"
					path="commPrct" />
			</div>
		</div>

		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="partAmount">Part Amount</label>
				<sf:input type="number" class="form-control" id="partAmount"
					path="partAmount" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="gst">Gst</label>
				<sf:input type="number" class="form-control" id="gst" path="gst" />
			</div>
		</div>

		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="exclusive">Exclusive</label>
				<sf:input type="text" class="form-control" id="exclusive"
					path="exclusive" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="appDate">AppDate</label>
				<sf:input type="date" class="form-control" id="appDate"
					path="appDate" />
			</div>
		</div>

		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="expDate">Exp Date</label>
				<sf:input type="date" class="form-control" id="expDate"
					path="expDate" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="stat">Stat</label>
				<sf:input type="text" class="form-control" id="stat" path="stat" />
			</div>
		</div>

		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="statDate">Stat Date</label>
				<sf:input type="date" class="form-control" id="statDate"
					path="statDate" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="remarks">Remarks</label>
				<sf:input type="text" class="form-control" id="remarks"
					path="remarks" />
			</div>
		</div>

		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="glCode">GlCode</label>
				<sf:input type="text" class="form-control" id="glCode" path="glCode" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="chkDgt">chkDgt</label>
				<sf:input type="text" class="form-control" id="chkDgt" path="chkDgt" />
			</div>
		</div>

		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="ovrdDate">OvrdDate</label>
				<sf:input type="date" class="form-control" id="ovrdDate"
					path="ovrdDate" />
			</div>
		</div>
		<button class="btn btn-primary" type="submit">Submit form</button>
	</sf:form>
</div>