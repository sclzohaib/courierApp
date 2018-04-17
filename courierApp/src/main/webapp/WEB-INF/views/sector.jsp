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
		<li class="breadcrumb-item active">Sector</li>
	</ol>
	<sf:form modelAttribute="sector" action="${contextRoot}/sector"
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
				<label for="sectorTypeNo">Sector Type No</label>
				<sf:input type="text" class="form-control" id="sectorTypeNo"
					path="sectorTypeNo" />
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
		<button class="btn btn-primary" type="submit">Submit form</button>
	</sf:form>
</div>