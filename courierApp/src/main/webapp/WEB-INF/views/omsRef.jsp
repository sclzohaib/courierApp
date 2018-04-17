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
		<li class="breadcrumb-item active">OMS CNSG REF</li>
	</ol>
	<sf:form modelAttribute="omsCnsgRef"
		action="${contextRoot}/oms-cnsg-ref" method="POST">

		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="awNo">AWB No</label>
				<sf:input type="text" class="form-control" id="awNo" path="awNo" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="Tty">TTY</label>
				<sf:input type="text" class="form-control" id="Tty" path="Tty" />
			</div>
		</div>

		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="tDate">TDate</label>
				<sf:input type="date" class="form-control" id="tDate" path="tDate" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="modulas">Modulas</label>
				<sf:input type="text" class="form-control" id="modulas"
					path="modulas" />
			</div>
		</div>
		<div class="form-row">

			<div class="col-md-3 mb-3">
				<label for="curCnsgNo">Cur Cnsg No</label>
				<sf:input type="text" class="form-control" id="curCnsgNo"
					path="curCnsgNo" />
			</div>
		</div>
		<button class="btn btn-primary" type="submit">Submit form</button>
		<!-- Form end -->
	</sf:form>
</div>