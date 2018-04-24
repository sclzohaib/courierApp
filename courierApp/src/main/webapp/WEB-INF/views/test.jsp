<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<div class="container">
	<h2>${title}</h2>
	<sf:form modelAttribute="md" action="${contextRoot}/md"
		method="POST">
		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="Id">ID</label>
				<sf:input type="text" class="form-control" id="Id" path="Id" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="description">Name</label>
				<sf:input type="text" class="form-control" id="name"
					path="name" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="sectorTypeNo">Address</label>
				<sf:input type="text" class="form-control" id="address"
					path="detail.address" />
			</div>
		</div>
		<button class="btn btn-primary" type="submit">Submit form</button>
	</sf:form>
</div>