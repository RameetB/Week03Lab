<%-- 
    Document   : arithmeticCalculator
    Created on : 25-Sep-2020, 10:58:07 AM
    Author     : 814992
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="number" name="first"><br>
            Second: <input type="number" name="second"><br>
            
            <input type="submit" value="*" name="calculation">
            <input type="submit" value="/" name="calculation">
            <input type="submit" value="-" name="calculation">
            <input type="submit" value="+" name="calculation">
        </form>
        <p>${message}</p>
    </body>
</html>
