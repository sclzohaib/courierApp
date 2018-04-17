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
		<li class="breadcrumb-item active">Route</li>
	</ol>
	<sf:form modelAttribute="route" action="${contextRoot}/route"
		method="POST">

		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="rutNo">Route No</label>
				<sf:input type="text" class="form-control" id="rutNo" path="rutNo" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="dscrp">Description</label>
				<sf:input type="text" class="form-control" id="dscrp" path="dscrp" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="rutTypNo">Route Type No</label>
				<sf:input type="text" class="form-control" id="rutTypNo"
					path="rutTypNo" />
			</div>
		</div>

		<div class="form-row">

			<div class="col-md-3 mb-3">
				<label for="pikTimNo">Pik Tim No</label>
				<sf:input type="text" class="form-control" id="pikTimNo"
					path="pikTimNo" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="delTimNo">Del Tim No</label>
				<sf:input type="text" class="form-control" id="delTimNo"
					path="delTimNo" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="cityNo">City No</label>
				<sf:input type="text" class="form-control" id="cityNo" path="cityNo" />
			</div>
		</div>
		<div class="form-row">

			<div class="col-md-3 mb-3">
				<label for="pikRate">Pik Rate</label>
				<sf:input type="number" class="form-control" id="pikRate"
					path="pikRate" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="delRate">Del Rate</label>
				<div class="input-group">
					<sf:input type="number" class="form-control" id="delRate"
						path="delRate" aria-describedby="inputGroupPrepend3" />
				</div>
			</div>
			<div class="col-md-3 mb-3">
				<label for="remarks">Remarks</label>
				<div class="input-group">
					<sf:input type="text" class="form-control" id="remarks"
						path="remarks" aria-describedby="inputGroupPrepend3" />
				</div>
			</div>
		</div>
		<div class="form-row">

			<div class="col-md-3 mb-3">
				<label for="stat">Stat</label>
				<sf:input type="text" class="form-control" id="stat" path="stat" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="saleTrty">Sale Trty</label>
				<div class="input-group">
					<sf:input type="text" class="form-control" id="saleTrty"
						path="saleTrty" aria-describedby="inputGroupPrepend3" />
				</div>
			</div>
		</div>
		<button class="btn btn-primary" type="submit">Submit form</button>
		<!-- Form end -->
	</sf:form>
</div>