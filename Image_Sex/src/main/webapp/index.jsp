<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- start banner -->
	<div class="sizebanner">

  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
        <img src="img/tm-img-06.jpg" alt="Los Angeles" style="width:100%;">
      </div>

      <div class="item">
        <img src="img/tm-img-06.jpg" alt="Chicago" style="width:100%;">
      </div>
    
      <div class="item">
        <img src="img/tm-img-05.jpg" alt="New york" style="width:100%; ">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
	<!-- end banner -->
	<jsp:include page="header.jsp" />
	<div class="products"
		style="background-color: #FAEBD7; margin-left: 15%; margin-right: 15%;">
		<c:forEach items="${requestScope.listImage}" var="i">

			<div style="float: left; width: 33.33%;">
				<div class="contai">
					<img src="img/${i.sourceAvata}" alt="Avatar" class="image">
					<div class="middle">
						<div class="text">${i.nameViewer}</div>
						<div class=des>${i.description}</div>
					</div>
				</div>
			</div>
		</c:forEach>
		<div style="clear: both;"></div>
	</div>
</body>
</html>