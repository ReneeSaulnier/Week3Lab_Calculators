<%-- 
    Document   : agecalculator
    Created on : 18-Jan-2023, 11:04:07 PM
    Author     : Renee
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
            Enter your age: <input type="text" name="age"> 
            <br>
            <input type="submit" value="submit">
            <br>
        </form>
        <p>${message}</p>
            <a href="/ArithemeticCalculator>">Arithmetic Calculator</a>
    </body>
</html>
