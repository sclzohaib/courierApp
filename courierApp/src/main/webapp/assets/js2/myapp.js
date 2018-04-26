
$(function() {
	$('#shipperInfo').keyup(onShipperChange);
function onShipperChange() {	
    $.ajax({  	 
        url: "search2",
        data: {
            info: $('#shipperInfo').val()           
        },
        type: "GET",
        success: function (data) {
            
            var array_data = String(data).split("\n");
            $('#shipperName').val(array_data[2]);
            $('#shipperCompany').val(array_data[3]);
            $('#shipperAddress').val(array_data[4]);
            $('#shipperPhone').val(array_data[6]);  
        },
        error: function (data) {
        }
    })
};
$('#cnsgInfo').keyup(onCnsgChange);
function onCnsgChange() {	
    $.ajax({  	 
        url: "search",
        data: {
        	action:'cnsg',
            info: $('#cnsgInfo').val()           
        },
        type: "GET",
        success: function (data) { 
            var array_data = String(data).split("\n");
            $('#cnsgName').val(array_data[2]);
            $('#cnsgCompany').val(array_data[3]);
            $('#cnsgAddress').val(array_data[4]);
            $('#cnsgPhone').val(array_data[6]);
        },
        error: function (data) {
        }
    })
};
$('#origin').keyup(onOriginChange);
function onOriginChange() {	
    $.ajax({  	 
        url: "search",
        data: {
        	action:'origin',
            info: $('#origin').val()           
        },
        type: "GET",
        success: function (data) { 
            var array_data = String(data).split("\n");
            $('#cityName').val(array_data[2]);
        },
        error: function (data) {
        }
    })
};

$('#btnSave').click(function() {
    var width = $('#width').val();
    var length = $('#length').val();
    var height = $('#height').val();
    var dimension= (length*width*height)/5000;
    $('#dimensions').val(dimension);
    $('#myDimensionModal').modal('hide');
  });

$('#productId').change(serviceAmount);
$('#serviceType').change(serviceAmount);
$('#paymentMode').change(serviceAmount);
function serviceAmount() {	
    $.ajax({  	 
        url: "search",
        data: {
        	action:'service',
            product: $('#productId').val(),
            service: $('#serviceType').val(),
            payment: $('#paymentMode').val()
        },
        type: "GET",
        success: function (data) { 
            var array_data = String(data).split("\n");
            $('#serviceAmount').val(array_data[2]);
        },
        error: function (data) {
        }
    })
};
});