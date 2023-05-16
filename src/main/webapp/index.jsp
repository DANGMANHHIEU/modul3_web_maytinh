<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>May Tinh</title>
</head>
<body>
<h1> Simple Calculator</h1>
<form action="maytinh" method="post">
    <h2> Calculator</h2>
    <input type="text" name="number1" placeholder="Enter number 1"><br/>
    <select name="aa">
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="*">x</option>
        <option value="/">:</option>
    </select><br/>
    <input type="text" name="number2" placeholder="Enter number 2"><br/>
    <input type="submit" value="OK">
</form>
</body>
</html>