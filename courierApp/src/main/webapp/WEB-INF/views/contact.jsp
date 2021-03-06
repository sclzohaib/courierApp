<!-- Page Content -->
<div class="container">

	<!-- Page Heading/Breadcrumbs -->
	<h1 class="mt-4 mb-3">
		Contact <small>Burkitech Courier</small>
	</h1>

	<ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="index.html">Home</a></li>
		<li class="breadcrumb-item active">Contact</li>
	</ol>

	<!-- Content Row -->
	<div class="row">
		<!-- Map Column -->
		<div class="col-lg-8 mb-4">
			<!-- Embedded Google Map -->
			<!--<iframe width="100%" height="400px" frameborder="0" scrolling="no"
				marginheight="0" marginwidth="0"
				src="http://maps.google.com/maps?hl=en&amp;ie=UTF8&amp;ll=37.0625,-95.677068&amp;spn=56.506174,79.013672&amp;t=m&amp;z=4&amp;output=embed"></iframe>
		-->
			<iframe width="100%" height="400px" frameborder="0" style="border: 0"
				src="https://www.google.com/maps/embed/v1/directions?origin=place_id:ChIJQWGdnI4-sz4RpPnDRp5suHw&destination=place_id:ChIJQWGdnI4-sz4RpPnDRp5suHw&key=AIzaSyCjBALDopK-1i1Tlfa3NsBKjI2rRqJgMbE"
				allowfullscreen></iframe>
		</div>
		<!-- Contact Details Column -->
		<div class="col-lg-4 mb-4">
			<h3>Contact Details</h3>
			<p>
				Karachi <br>Pakistan <br>Burki Tower III-O, Mezzanine
				Floor<br> Main Khalid-Bin-Waleed Rd <br>P.E.C.H.S.
				Block-2, Karachi-75400. <br>
			</p>
			<p>
				<abbr title="Phone">P</abbr>: (123) 456-7890
			</p>
			<p>
				<abbr title="Email">E</abbr>: <a href="${contextRoot}/mailform">info@burkitech.com
				</a>
			</p>
			<p>
				<abbr title="Hours">H</abbr>: Monday - Friday: 9:00 AM to 5:00 PM
			</p>
		</div>
	</div>
	<!-- /.row -->

	<!-- Contact Form -->
	<!-- In order to set the email address and subject line for the contact form go to the bin/contact_me.php file. -->
	<div class="row">
		<div class="col-lg-8 mb-4">
			<h3>Send us a Message</h3>
			<form name="sentMessage" action="${contextRoot}/contact" id="contactForm" novalidate method="post">
				<div class="control-group form-group">
					<div class="controls">
						<label>Full Name:</label> 
						<input type="text" class="form-control" id="name" name="name" required 
							data-validation-required-message="Please enter your name.">
						<p class="help-block"></p>
					</div>
				</div>
				<div class="control-group form-group">
					<div class="controls">
						<label>Phone Number:</label> <input type="tel"
							class="form-control" id="phone" name="phone" required
							data-validation-required-message="Please enter your phone number.">
					</div>
				</div>
				<div class="control-group form-group">
					<div class="controls">
						<label>Email Address:</label> <input type="email"
							class="form-control" id="email" name="email" required
							data-validation-required-message="Please enter your email address.">
					</div>
				</div>
				<div class="control-group form-group">
					<div class="controls">
						<label>Message:</label>
						<textarea rows="10" cols="100" class="form-control" id="message" name="message"
							required
							data-validation-required-message="Please enter your message"
							maxlength="999" style="resize: none"></textarea>
					</div>
				</div>
				<div id="success"></div>
				<!-- For success/fail messages -->
				<button type="submit" class="btn btn-primary" id="sendMessageButton">Send
					Message</button>
			</form>
		</div>

	</div>
	<!-- /.row -->

</div>

<!-- Contact form JavaScript -->
<!-- Do not edit these files! In order to set the email address and subject line for the contact form go to the bin/contact_me.php file. -->
<script src="${js2}/jqBootstrapValidation.js"></script>
<script src="${js2}/contact_me.js"></script>
