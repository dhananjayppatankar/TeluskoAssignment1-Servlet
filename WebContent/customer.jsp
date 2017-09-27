<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>


<body bgcolor="black">

	<div class="container">
		<h2 align="center">Random Id Generator</h2>
		<form action="add" method="post">
			<div class="form-group">
				<label for="email">Enter Name :</label> <input type="text"
					class="form-control" id="name" placeholder="Enter Name" name="name">
			</div>
			<div class="form-group">
				<label for="text">Enter Age :</label> <input type="text"
					class="form-control" id="age" placeholder="Enter Age"
					name="age">
			</div>
			<div class="form-group">
				<label for="address">Enter Address :</label> <input type="text"
					class="form-control" id="address" placeholder="Enter Address"
					name="address">
			</div>
			<div class="checkbox">
				<label><input type="checkbox" name="remember">
					Remember me</label>
			</div>
			<button type="submit" class="btn btn-default">Generate Id</button>
		</form>
	</div>

</body>
</html>



</body>
</html>