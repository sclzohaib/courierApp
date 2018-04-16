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
		<li class="breadcrumb-item active">Hand Instr</li>
	</ol>
	<sf:form modelAttribute="handInstr" action="${contextRoot}/hand-instr"
		method="POST">

		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="itemCode">Item Code</label>
				<sf:input type="text" class="form-control" id="itemCode" path="itemCode" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="classCode">Class Code</label>
				<sf:input type="text" class="form-control" id="classCode"
					path="classCode" />
			</div>
		</div>
		
		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="glCode">Gl Code</label>
				<sf:input type="text" class="form-control" id="glCode" path="glCode" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="prfrdVend">Prfrd Vend</label>
				<sf:input type="text" class="form-control" id="prfrdVend"
					path="prfrdVend" />
			</div>
		</div>
		
		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="locationCode">Location Code</label>
				<sf:input type="text" class="form-control" id="locationCode" path="locationCode" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="uom">Uom</label>
				<sf:input type="text" class="form-control" id="uom"
					path="uom" />
			</div>
		</div>
		
		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="name">Name</label>
				<sf:input type="text" class="form-control" id="name" path="name" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="sellPrice">Sell Price</label>
				<sf:input type="text" class="form-control" id="sellPrice"
					path="sellPrice" />
			</div>
		</div>
		
		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="avgPurRate">AvgPurRate</label>
				<sf:input type="number" class="form-control" id="avgPurRate" path="avgPurRate" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="itemStat">Item Stat</label>
				<sf:input type="text" class="form-control" id="itemStat"
					path="itemStat" />
			</div>
		</div>
		
		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="openQuantity">Open Quantity</label>
				<sf:input type="number" class="form-control" id="openQuantity" path="openQuantity" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="reOrderLevel">ReOrderLevel</label>
				<sf:input type="number" class="form-control" id="reOrderLevel"
					path="reOrderLevel" />
			</div>
		</div>
		
		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="maxOrderQuantity">MaxOrderQuantity</label>
				<sf:input type="number" class="form-control" id="maxOrderQuantity" path="maxOrderQuantity" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="ytdRec">YtdRec</label>
				<sf:input type="number" class="form-control" id="ytdRec"
					path="ytdRec" />
			</div>
		</div>
		
		<div class="form-row">
			<div class="col-md-3 mb-3">
				<label for="ytdIsu">YtdIsu</label>
				<sf:input type="number" class="form-control" id="ytdIsu" path="ytdIsu" />
			</div>
			<div class="col-md-3 mb-3">
				<label for="lastIsuDate">LastIsuDate</label>
				<sf:input type="Date" class="form-control" id="lastIsuDate"
					path="lastIsuDate" />
			</div>
		</div>
		
		
		</div>
		
		
		
		
		<button class="btn btn-primary" type="submit">Submit form</button>
		<!-- Form End -->
	</sf:form>
</div>