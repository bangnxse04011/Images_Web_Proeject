<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Fluid Gallery HTML5 CSS3 Template</title>
<!--
Fluid Gallery Template
http://www.templatemo.com/tm-500-fluid-gallery
-->
<!-- load stylesheets -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600">
<!-- Google web font "Open Sans" -->
<link rel="stylesheet" href="Font-Awesome-4.7/css/font-awesome.min.css">
<!-- Font Awesome -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- Bootstrap style -->
<link rel="stylesheet" href="css/hero-slider-style.css">
<!-- Hero slider style (https://codyhouse.co/gem/hero-slider/) -->
<link rel="stylesheet" href="css/magnific-popup.css">
<!-- Magnific popup style (http://dimsemenov.com/plugins/magnific-popup/) -->
<link rel="stylesheet" href="css/templatemo-style.css">
<link rel="stylesheet" type="text/css" href="css/templatebonus.css">
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
          <![endif]-->

<!-- These two JS are loaded at the top for gray scale including the loader. -->

<script src="js/jquery-1.11.3.min.js"></script>
<!-- jQuery (https://jquery.com/download/) -->


<script>
	// Get the modal
	var modal = document.getElementById('id01');

	// When the user clicks anywhere outside of the modal, close it
	window.onclick = function(event) {
		if (event.target == modal) {
			modal.style.display = "none";
		}
	}
</script>
</head>

<body>
	<div style="margin-left: 15%; margin-right: 15%">
		<!-- Content -->
		<div class="cd-hero">

			<!-- Navigation -->

			<div class="cd-slider-nav">
				<nav class="navbar">
					<div class="tm-navbar-bg">

						<a class="navbar-brand text-uppercase" href="#"> <img
							src="img/logo-Huy-2.png" alt="Image" class="logoTu"> AnhR18
						</a>

						<button class="navbar-toggler hidden-lg-up" type="button"
							data-toggle="collapse" data-target="#tmNavbar">&#9776;</button>
						<div
							class="collapse navbar-toggleable-md text-xs-center text-uppercase tm-navbar"
							id="tmNavbar">
							<ul class="nav navbar-nav ">
								<li class="nav-item active selected"><a class="nav-link"
									href="#0" data-no="1">1st fluid <span class="sr-only">(current)</span></a>
								</li>
								<li class="nav-item"><a class="nav-link" href="#">2nd
										fluid</a></li>

								<li class="nav-item"><a class="nav-link" href="#"
									onclick="document.getElementById('id01').style.display='block'">
										Login</a></li>

							</ul>
						</div>
					</div>

				</nav>
			</div>
			<div id="id01" class="modal loginModal" style="margin: 0 auto;">
				<span onclick="document.getElementById('id01').style.display='none'"
					class="close" title="Close Modal">&times;</span>
				<form action="">
					<div class="imgcontainer" style="background-color: #f1f1f1">
						<img src="img/img_avatar2.png" alt="Avatar" class="avatar">
					</div>
					<div class="imgcontainer" style="background-color: #f1f1f1">
					<center>
						<table>
							<tr>
								<td><label><b>Username</b></label></td>
								<td ><input style="width: 100%;" type="text" placeholder="Enter Username"
									name="uname" required></td>
							</tr>
							<tr>
								<td><label><b>Password</b></label></td>
								<td ><input type="password" style="width: 100%;"placeholder="Enter Password"
									name="psw" required></td>
							</tr>
						</table>
						</center>
						<button type="submit">Login</button>
						<input type="checkbox" checked="checked"> Remember me

						<button type="button"
							onclick="document.getElementById('id01').style.display='none'"
							class="cancelbtn">Cancel</button>

					</div>
				</form>
			</div>
			<ul class="cd-hero-slider">

				<!-- Page 1 Gallery One -->
				<li class="selected">
					<div class="cd-full-width">
						<div class="container-fluid js-tm-page-content" data-page-no="1"
							data-page-type="gallery">
							<div class="tm-img-gallery-container">
								<div class="tm-img-gallery gallery-one">

									<!-- Gallery One pop up connected with JS code below -->

									<div class="grid-item">
										<figure class="effect-sadie">
											<img src="img/AR18 (1).jpg" alt="Image"
												class="img-fluid tm-img">
											<figcaption>
												<h2 class="tm-figure-title">
													Image <span><strong>One</strong></span>
												</h2>
												<p class="tm-figure-description">Set true or false in
													HTML script tag for this page black and white.</p>
												<a href="img/tm-img-01.jpg">View more</a>
											</figcaption>
										</figure>
									</div>
									<div class="grid-item">
										<figure class="effect-sadie">
											<img src="img/AR18 (2).jpg" alt="Image"
												class="img-fluid tm-img">
											<figcaption>
												<h2 class="tm-figure-title">
													Image <span><strong>Two</strong></span>
												</h2>
												<p class="tm-figure-description">Set true or false in
													HTML page line number 40 to turn on off page color.</p>
												<a href="img/tm-img-02.jpg">View more</a>
											</figcaption>
										</figure>
									</div>
									<div class="grid-item">
										<figure class="effect-sadie">
											<img src="img/AR18 (3).jpg" alt="Image"
												class="img-fluid tm-img">
											<figcaption>
												<h2 class="tm-figure-title">
													Image <span><strong>Three</strong></span>
												</h2>
												<p class="tm-figure-description">Lorem ipsum dolor sit
													amet, consectetur adipiscing elit.</p>
												<a href="img/tm-img-03.jpg">View more</a>
											</figcaption>
										</figure>
									</div>
									<div class="grid-item">
										<figure class="effect-sadie">
											<img src="img/AR18 (4).jpg" alt="Image"
												class="img-fluid tm-img">
											<figcaption>
												<h2 class="tm-figure-title">
													Image <span><strong>Four</strong></span>
												</h2>
												<p class="tm-figure-description">Maecenas purus sem,
													lobortis id odio in sapien.</p>
												<a href="img/tm-img-04.jpg">View more</a>
											</figcaption>
										</figure>
									</div>
									<div class="grid-item">
										<figure class="effect-sadie">
											<img src="img/tm-img-05-tn.jpg" alt="Image"
												class="img-fluid tm-img">
											<figcaption>
												<h2 class="tm-figure-title">
													Image <span><strong>Five</strong></span>
												</h2>
												<p class="tm-figure-description">Lorem ipsum dolor sit
													amet, consectetur adipiscing elit.</p>
												<a href="img/AR18 (5).jpg">View more</a>
											</figcaption>
										</figure>
									</div>
									<div class="grid-item">
										<figure class="effect-sadie">
											<img src="img/AR18 (10).jpg" alt="Image"
												class="img-fluid tm-img">
											<figcaption>
												<h2 class="tm-figure-title">
													Image <span><strong>Six</strong></span>
												</h2>
												<p class="tm-figure-description">Maecenas purus sem,
													lobortis id odio in sapien.</p>
												<a href="img/tm-img-06.jpg">View more</a>
											</figcaption>
										</figure>
									</div>
									<div class="grid-item">
										<figure class="effect-sadie">
											<img src="img/AR18 (7).jpg" alt="Image"
												class="img-fluid tm-img">
											<figcaption>
												<h2 class="tm-figure-title">
													Image <span><strong>Seven</strong></span>
												</h2>
												<p class="tm-figure-description">Lorem ipsum dolor sit
													amet, consectetur adipiscing elit.</p>
												<a href="img/tm-img-07.jpg">View more</a>
											</figcaption>
										</figure>
									</div>
									<div class="grid-item">
										<figure class="effect-sadie">
											<img src="img/AR18 (8).jpg" alt="Image"
												class="img-fluid tm-img">
											<figcaption>
												<h2 class="tm-figure-title">
													Image <span><strong>Eight</strong></span>
												</h2>
												<p class="tm-figure-description">Maecenas purus sem,
													lobortis id odio in sapien.</p>
												<a href="img/tm-img-08.jpg">View more</a>
											</figcaption>
										</figure>
									</div>
									<div class="grid-item">
										<figure class="effect-sadie">
											<img src="img/AR18 (9).jpg" alt="Image"
												class="img-fluid tm-img">
											<figcaption>
												<h2 class="tm-figure-title">
													Image <span><strong>Nine</strong></span>
												</h2>
												<p class="tm-figure-description">Lorem ipsum dolor sit
													amet, consectetur adipiscing elit.</p>
												<a href="img/tm-img-09.jpg">View more</a>
											</figcaption>
										</figure>
									</div>
									<div class="grid-item">
										<figure class="effect-sadie">
											<img src="img/AR18 (10).jpg" alt="Image"
												class="img-fluid tm-img">
											<figcaption>
												<h2 class="tm-figure-title">
													Image <span><strong>Ten</strong></span>
												</h2>
												<p class="tm-figure-description">Maecenas purus sem,
													lobortis id odio in sapien.</p>
												<a href="img/tm-img-10.jpg">View more</a>
											</figcaption>
										</figure>
									</div>
									<div class="grid-item">
										<figure class="effect-sadie">
											<img src="img/AR18 (11).jpg" alt="Image"
												class="img-fluid tm-img">
											<figcaption>
												<h2 class="tm-figure-title">
													Image <span><strong>Eleven</strong></span>
												</h2>
												<p class="tm-figure-description">Lorem ipsum dolor sit
													amet, consectetur adipiscing elit.</p>
												<a href="img/tm-img-11.jpg">View more</a>
											</figcaption>
										</figure>
									</div>
									<div class="grid-item">
										<figure class="effect-sadie">
											<img src="img/AR18 (12).jpg" alt="Image"
												class="img-fluid tm-img">
											<figcaption>
												<h2 class="tm-figure-title">
													Image <span><strong>Twelve</strong></span>
												</h2>
												<p class="tm-figure-description">Maecenas purus sem,
													lobortis id odio in sapien.</p>
												<a href="img/tm-img-12.jpg">View more</a>
											</figcaption>
										</figure>
									</div>
									<div class="grid-item">
										<figure class="effect-sadie">
											<img src="img/tm-img-13-tn.jpg" alt="Image"
												class="img-fluid tm-img">
											<figcaption>
												<h2 class="tm-figure-title">
													Image <span><strong>Thirteen</strong></span>
												</h2>
												<p class="tm-figure-description">Lorem ipsum dolor sit
													amet, consectetur adipiscing elit.</p>
												<a href="img/tm-img-13.jpg">View more</a>
											</figcaption>
										</figure>
									</div>
									<div class="grid-item">
										<figure class="effect-sadie">
											<img src="img/tm-img-14-tn.jpg" alt="Image"
												class="img-fluid tm-img">
											<figcaption>
												<h2 class="tm-figure-title">
													Image <span><strong>Fourteen</strong></span>
												</h2>
												<p class="tm-figure-description">Maecenas purus sem,
													lobortis id odio in sapien.</p>
												<a href="img/tm-img-14.jpg">View more</a>
											</figcaption>
										</figure>
									</div>
									<div class="grid-item">
										<figure class="effect-sadie">
											<img src="img/tm-img-15-tn.jpg" alt="Image"
												class="img-fluid tm-img">
											<figcaption>
												<h2 class="tm-figure-title">
													Image <span><strong>Fifteen</strong></span>
												</h2>
												<p class="tm-figure-description">Lorem ipsum dolor sit
													amet, consectetur adipiscing elit.</p>
												<a href="img/tm-img-15.jpg">View more</a>
											</figcaption>
										</figure>
									</div>
									<div class="grid-item">
										<figure class="effect-sadie">
											<img src="img/tm-img-16-tn.jpg" alt="Image"
												class="img-fluid tm-img">
											<figcaption>
												<h2 class="tm-figure-title">
													Image <span><strong>Sixteen</strong></span>
												</h2>
												<p class="tm-figure-description">Maecenas purus sem,
													lobortis id odio in sapien.</p>
												<a href="img/tm-img-16.jpg">View more</a>
											</figcaption>
										</figure>
									</div>
								</div>
							</div>
						</div>
					</div>
				</li>
			</ul>



			<!-- .cd-hero-slider -->

			<footer class="tm-footer">

				<div class="tm-social-icons-container text-xs-center">
					<a href="#" class="tm-social-link"><i class="fa fa-facebook"></i></a>
					<a href="#" class="tm-social-link"><i class="fa fa-google-plus"></i></a>
					<a href="#" class="tm-social-link"><i class="fa fa-twitter"></i></a>
					<a href="#" class="tm-social-link"><i class="fa fa-behance"></i></a>
					<a href="#" class="tm-social-link"><i class="fa fa-linkedin"></i></a>
				</div>

				<p class="tm-copyright-text">
					Copyright &copy; <span class="tm-copyright-year">current
						year</span> Your Company
			</footer>

		</div>
		<!-- .cd-hero -->


		<!-- Preloader, https://ihatetomatoes.net/create-custom-preloading-screen/ -->
		<div id="loader-wrapper">

			<div id="loader"></div>
			<div class="loader-section section-left"></div>
			<div class="loader-section section-right"></div>

		</div>

		<!-- load JS files -->

		<script src="js/tether.min.js"></script>
		<!-- Tether (http://tether.io/)  -->
		<script src="js/bootstrap.min.js"></script>
		<!-- Bootstrap js (v4-alpha.getbootstrap.com/) -->
		<script src="js/hero-slider-main.js"></script>
		<!-- Hero slider (https://codyhouse.co/gem/hero-slider/) -->
		<script src="js/jquery.magnific-popup.min.js"></script>
		<!-- Magnific popup (http://dimsemenov.com/plugins/magnific-popup/) -->

		<script>
			function adjustHeightOfPage(pageNo) {

				var pageContentHeight = 0;

				var pageType = $('div[data-page-no="' + pageNo + '"]').data(
						"page-type");

				if (pageType != undefined && pageType == "gallery") {
					pageContentHeight = $(
							".cd-hero-slider li:nth-of-type(" + pageNo
									+ ") .tm-img-gallery-container").height();
				} else {
					pageContentHeight = $(
							".cd-hero-slider li:nth-of-type(" + pageNo
									+ ") .js-tm-page-content").height() + 20;
				}

				// Get the page height
				var totalPageHeight = $('.cd-slider-nav').height()
						+ pageContentHeight + $('.tm-footer').outerHeight();

				// Adjust layout based on page height and window height
				if (totalPageHeight > $(window).height()) {
					$('.cd-hero-slider').addClass('small-screen');
					$('.cd-hero-slider li:nth-of-type(' + pageNo + ')').css(
							"min-height", totalPageHeight + "px");
				} else {
					$('.cd-hero-slider').removeClass('small-screen');
					$('.cd-hero-slider li:nth-of-type(' + pageNo + ')').css(
							"min-height", "100%");
				}
			}

			/*
			    Everything is loaded including images.
			 */
			$(window)
					.load(
							function() {

								adjustHeightOfPage(1); // Adjust page height

								/* Gallery One pop up
								-----------------------------------------*/
								$('.gallery-one').magnificPopup({
									delegate : 'a', // child items selector, by clicking on it popup will open
									type : 'image',
									gallery : {
										enabled : true
									}
								});

								/* Collapse menu after click 
								-----------------------------------------*/
								$('#tmNavbar a').click(function() {
									$('#tmNavbar').collapse('hide');

									adjustHeightOfPage($(this).data("no")); // Adjust page height       
								});

								/* Browser resized 
								-----------------------------------------*/
								$(window)
										.resize(
												function() {
													var currentPageNo = $(
															".cd-hero-slider li.selected .js-tm-page-content")
															.data("page-no");

													// wait 3 seconds
													setTimeout(
															function() {
																adjustHeightOfPage(currentPageNo);
															}, 1000);

												});

								// Remove preloader (https://ihatetomatoes.net/create-custom-preloading-screen/)
								$('body').addClass('loaded');

								// Write current year in copyright text.
								$(".tm-copyright-year").text(
										new Date().getFullYear());

							});
		</script>

	</div>
</body>
</html>