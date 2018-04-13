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
		<li class="breadcrumb-item active">Forms</li>
		<li class="breadcrumb-item active">Delivery</li>
	</ol>
	<sf:form modelAttribute="delivery" action="${contextRoot}/delivery"
		method="POST">

		<div class="form-row">
			<div class="col-md-4 mb-3">
				<label for="id">ID</label>
				<sf:input type="text" class="form-control" id="id" path="id" />
			</div>
		</div>

		<div class="form-row">
			<div class="col-md-4 mb-3">
				<label for="dDate">Date</label>
				<sf:input type="text" class="form-control" id="dDate" path="dDate" />
			</div>
			<div class="col-md-4 mb-3">
				<label for="transportType">Transport Type</label>
				<sf:input type="text" class="form-control" id="transportType"
					path="transportType" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-4 mb-3">
				<label for="vehicleNo">Vehicle Number</label>
				<div class="input-group">
					<sf:input type="text" class="form-control" id="vehicleNo"
						path="vehicleNo" aria-describedby="inputGroupPrepend3" />
				</div>
			</div>
			<div class="col-md-3 mb-3">
				<label for="cityNo">City</label>
				<sf:input type="text" class="form-control" id="cityNo" path="cityNo" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="timeSlot">Time Slot</label>
				<sf:input type="text" class="form-control" id="timeSlot"
					path="timeSlot" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="empId">Employee</label>
				<sf:input type="text" class="form-control" id="empId" path="empId" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-6 mb-3">
				<label for="route">Route</label>
				<sf:input type="text" class="form-control" id="route" path="route" />
			</div>
		</div>
		<button class="btn btn-primary" type="submit">Submit form</button>
		<!-- Form end -->
	</sf:form>
</div>