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
        <form method="post" action="age">
            Enter your age: <input type="text" name="age" value="${age}"> 
            <br>
            <input type="submit" value="Age next birthday">
            <br>
        </form>
            <a href="arithmeticcalculator.jsp">Arithmetic Calculator</a>
    </body>
</html>
