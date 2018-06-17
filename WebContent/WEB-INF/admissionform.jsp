<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admission</title>
</head>
<body>
<h1>${welcomemessage}</h1>
<form action="./submiss" method="get">
<label for="fname" >FirstName</label>
<input id="fname" value="firstname" name="fname" />
<br />
<label for="lname" >LastName</label>
<input id="lname" value="lastname"  name="lname" />
<br />
<label for="rolno" >Roll No</label>
<input id="rono" value="10"  name="rollno" />
<br />
<select multiple name="hsa">
<option value="ORACLE">
	JAVA
</option>
<option value="J2EE">
	J2EE
</option>
<option value="ORACLE">
	ORACLE
</option>
</select>
<br />
Colony: 
<input type="text" name="studentaddress.colony">
<br />
Street : 
<input type="text" name="studentaddress.street">
<br />
City : 
<input type="text" name="studentaddress.city">
<br />
ZipCode :
<input type="text" name="studentaddress.zipcode">
<br />


<button type="submit">Submit</button>
</form>
</body>
</html>