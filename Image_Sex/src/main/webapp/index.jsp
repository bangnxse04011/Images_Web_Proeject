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