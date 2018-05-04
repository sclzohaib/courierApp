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
		<li class="breadcrumb-item active">Employee</li>
	</ol>
	<sf:form modelAttribute="employee" action="${contextRoot}/employee"
		method="POST">

		<div class="form-row">
			<div class="col-md-2 mb-3">
				<label for="id">ID</label>
				<sf:input type="number" class="form-control" id="id" path="id" />
			</div>
		</div>

		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="name">Name</label>
				<sf:input type="text" class="form-control" id="name" path="name" />
			</div>
			<div class="col-md-2 mb-3">
				<label for="joinDate">Joining date</label>
				<sf:input type="date" class="form-control" id="joinDate"
					path="joinDate" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="validationServerUsername">Route</label>
				<div class="input-group">
					<sf:input type="text" class="form-control" id="route" path="route"
						aria-describedby="inputGroupPrepend3" />
				</div>
			</div>
			<div class="col-md-2 mb-3">
				<label for="validationServer03">City</label>
				<sf:input type="text" class="form-control" id="city" path="city" />
			</div>
		</div>
		<button class="btn btn-primary" id="submit" type="submit">Submit</button>
	</sf:form>
</div>