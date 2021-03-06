<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/templatebonus.css">
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">WebSiteName</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Page 1 <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="#">Page 1-1</a></li>
						<li><a href="#">Page 1-2</a></li>
						<li><a href="#">Page 1-3</a></li>
					</ul></li>
				<li><a href="#">Page 2</a></li>
			</ul>
			<form class="navbar-form navbar-left">
      <div class="form-group">
        <input type="text" class="form-control" placeholder="Search">
      </div>
      <button type="submit" class="btn btn-default">Submit</button>
    </form>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#" data-toggle="modal" data-target="#myModalSignUp"><span class="glyphicon glyphicon-user"></span>
						Sign Up</a></li>
				<li><a href="#" data-toggle="modal" data-target="#myModal"><span
						class="glyphicon glyphicon-log-in"></span> Login</a></li>
			</ul>
		</div>
	</nav>
	<div class="container">

		 <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Login</h4>
        </div>
        <div class="modal-body">
       <form>
  <div class="form-group">
    <label for="email">User:</label>
    <input type="email" class="form-control" id="email">
  </div>
  <div class="form-group">
    <label for="pwd">Password:</label>
    <input type="password" class="form-control" id="pwd">
  </div>
  <div class="checkbox">
    <label><input type="checkbox"> Remember me</label>
  </div>
  <button type="submit" class="btn btn-success">Submit</button>
  <button type="button" class="btn btn-link">Forgot Password</button> 
</form>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
     
    </div>
  </div>
		 <div class="modal fade" id="myModalSignUp" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content Sign Up-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Sign Up</h4>
        </div>
        <div class="modal-body">
       <form>
  <div class="form-group">
    <label for="email">User:</label>
    <input type="email" class="form-control" id="email">
  </div>
  <div class="form-group">
    <label for="pwd">Password:</label>
    <input type="password" class="form-control" id="pwd">
  </div>
 <div class="form-group">
    <label for="pwd">Re-enter Password:</label>
    <input type="password" class="form-control" >
  </div>
 <div class="form-group">
    <label for="fName">First Name:</label>
    <input type="text" class="form-control" >
  </div>
  <div class="form-group">
    <label for="lName">Last Name:</label>
    <input type="text" class="form-control" >
  </div>
  <div class="form-group">
    <label for="phone">Phone:</label>
    <input type="number" class="form-control" >
  </div>
  <button type="submit" class="btn btn-success">Submit</button>
  
</form>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
     
    </div>
  </div>
	</div>
</body>
</html>