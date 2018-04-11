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
	<form action="${contextRoot}/employee" method="POST">
		<div class="form-row">
			<div class="col-md-4 mb-3">
				<label for="name">Name</label>
				<input type="text" class="form-control" id="name"></input>
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-4 mb-3">
				<label for="date">Joining Date</label>
				<!-- HTML Form (wrapped in a .bootstrap-iso div) -->
				<div class="bootstrap-iso">
					<input class="form-control" id="jdate" placeholder="MM/DD/YYYY" type="text" />
				</div>
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-4 mb-3">
				<label for="validationServerUsername">Route</label>
				<div class="input-group">
					<input type="text" class="form-control" id="route"
						aria-describedby="inputGroupPrepend3" />
				</div>
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="validationServer03">City</label>
				<input type="text" class="form-control" id="city"/>
			</div>
		</div>
		<button class="btn btn-primary" type="submit">Submit</button>
	</form>
</div>