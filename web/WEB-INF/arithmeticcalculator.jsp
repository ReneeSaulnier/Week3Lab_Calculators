<%-- 
    Document   : arithemeticcalculator
    Created on : 18-Jan-2023, 11:47:45 PM
    Author     : Renee
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
        <form method="post" action="arithemetic">
            First: <input type="text" name="first">
            <br>
            Second: <input type="text" name="last"> 
            <br>
            <input type="submit" name="submit" value="+"> 
            <input type="submit" name="submit" value="-"> 
            <input type="submit" name="submit" value="*"> 
            <input type="submit" name="submit" value="%"> 
            <br>
            <br>
            <div>Result: ${message}</div>
        </form>
            <a href="age">Age Calculator</a>
    </body>
</html>
