<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Greatest Number</title>
</head>
<body>
    <h2>Find the Greatest Number Among Three</h2>
    <form method="post">
        First Number: <input type="number" name="num1" required><br><br>
        Second Number: <input type="number" name="num2" required><br><br>
        Third Number: <input type="number" name="num3" required><br><br>
        <input type="submit" value="Find Greatest">
    </form>

<%
    String n1 = request.getParameter("num1");
    String n2 = request.getParameter("num2");
    String n3 = request.getParameter("num3");

    if(n1 != null && n2 != null && n3 != null) {
        try {
            int num1 = Integer.parseInt(n1);
            int num2 = Integer.parseInt(n2);
            int num3 = Integer.parseInt(n3);

            int greatest = num1;
            if(num2 > greatest) greatest = num2;
            if(num3 > greatest) greatest = num3;
%>
            <h3>The greatest number is: <%= greatest %></h3>
<%
        } catch(NumberFormatException e) {
%>
            <h3>Please enter valid numbers.</h3>
<%
        }
    }
%>
</body>
</html>
