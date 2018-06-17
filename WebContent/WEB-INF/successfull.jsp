<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admission Success</title>
</head>
<body>
<h1>${welcomemessage}</h1>
<h1>Hi <b><i>${s1s.fname}</i> hii <i>${s1s.lname} </i></b></h1>
<br/>
<pre>Your roll no is.<i> ${s1s.rollno}</i></pre>
<br/>
<pre>Your hobbies are <i> ${s1s.hsa}</i></pre>
Congrats,You are registered
<br />
<pre> ${s1s.studentaddress.colony} ,  ${s1s.studentaddress.street}  ,  ${s1s.studentaddress.city}</pre>
<pre>  ${s1s.studentaddress.zipcode} </pre>

</body>
</html>