<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>search</title>
</head>
<body>

<h2>Search Location By Id...</h2>

<form action="getLocation" method="post">

<b>Location Id  </b><input type="text" name="id"/>
			<input type="submit" value="search" />


</form>
	<a href="http://localhost:8080/getLocations">Search All Locations</a><br/>

	<a href="http://localhost:8080/showLocation">Add New Locations</a>
</body>
</html>