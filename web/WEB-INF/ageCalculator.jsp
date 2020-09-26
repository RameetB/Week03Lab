<%-- 
    Document   : ageCalculator
    Created on : 25-Sep-2020, 10:57:42 AM
    Author     : 814992
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="age" method="post">
        Enter your age: <input type="number" name="age" > <br>
        <input type="submit" value="Age next birthday" > <br>
        </form>
        <p>${message}</p>
        <a href="arithmetic">arithmetic calculator</a>
    </body>
</html>
