<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">  
       var xmlHttp1 ;  
       function searchSuggest(str)  
       {  
         if (typeof XMLHttpRequest != "undefined")  
         {  
           xmlHttp1= new XMLHttpRequest();  
         }  
         else if (window.ActiveXObject)  
         {  
           xmlHttp1= new ActiveXObject("Microsoft.XMLHTTP");  
         }  
         if (xmlHttp1==null)  
         {  
           alert ("Browser does not support XMLHTTP Request");  
           return  
         }  
         var url="search";  
         url += "?search=" +str;  
         xmlHttp1.onreadystatechange = stateChange1;  
         xmlHttp1.open("GET", url, true);  
         xmlHttp1.send();  
       }  
       function stateChange1()  
       {  
         if (xmlHttp1.readyState==4 || xmlHttp1.readyState=="complete")  
         {  
           var strResponse=xmlHttp1.responseText;  
           if (strResponse != "")  
           {  
             //Split response into array  
             var arrResponse = strResponse.split("brk");  
             var arrLen = arrResponse.length;  
             for(i=0;i<arrLen;i++)  
             {  
               document.getElementById("hint").innerHTML=arrResponse[0];  
               document.getElementById("firstName").innerHTML=arrResponse[1];  
               document.getElementById("lastName").innerHTML=arrResponse[2];  
               document.getElementById("no").innerHTML=arrResponse[3];  
               document.getElementById("cl").innerHTML=arrResponse[4];  
             }  
           }  
         }  
       }  
     </script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<input list="browsers" name="browser">
	<datalist id="browsers">
	<option value="Internet Explorer">
		
	<option value="Firefox">
  
	<option value="Chrome">
  
	<option value="Opera">
  
	<option value="Safari">
</datalist>
	<form method="post">
			<table>
			<tr>
				<td>Email Id:</td>
				<td><div id="eid">
						<input type="text" name="eid" onkeyup="searchSuggest(this.value);">
					</div></td>
				<td><div id="hint"></div></td>
			</tr>
			<tr>
				<td>First Name:</td>
				<td><div id="firstName">
						<input type="text" name="firstName">
					</div></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><div id="lastName">
						<input type="text" name="lastName">
					</div></td>
			</tr>
			<tr>
				<td>Mobile No:</td>
				<td><div id="no">
						<input type="text" name="no">
					</div></td>
			</tr>
			<tr>
				<td>Current Location:</td>
				<td><div id="cl">
						<input type="text" name="cl">
					</div></td>
			</tr>
		</table>
	</form>
</body>
</html>