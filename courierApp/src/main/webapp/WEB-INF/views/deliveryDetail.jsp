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
	<sf:form modelAttribute="deliveryDetail"
		action="${contextRoot}/delivery-detail" method="POST">

		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="id">ID</label>
				<sf:input type="text" class="form-control" id="id" path="id" disabled="true" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="item">Item</label>
				<sf:input type="text" class="form-control" id="item" path="item" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="reciever">Reciever</label>
				<sf:input type="text" class="form-control" id="reciever"
					path="reciever" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="recieveTime">Recieve Time</label>
				<sf:input type="text" class="form-control" id="recieveTime" path="recieveTime" />
			</div>
		</div>
		<div class="form-row">
			<div class="col-md-2 mb-3">		
				<sf:checkbox class="checkbox" value="Y" path="status" />
				<sf:hidden value="N" path="status" />
				<label for="status">Status</label>
			</div>
		</div>
		<button class="btn btn-primary" type="submit">Submit form</button>
		<!-- Form end -->
	</sf:form>
</div>