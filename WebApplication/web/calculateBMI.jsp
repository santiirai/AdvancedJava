<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>BMI Calculator</title>
</head>
<body>

<form method="post">
    <label>Weight (kg): </label>
    <input type="text" name="weight"><br><br>

    <label>Height (m): </label>
    <input type="text" name="height"><br><br>

    <input type="submit" value="Calculate BMI">
</form>

<%
    String w = request.getParameter("weight");
    String h = request.getParameter("height");

    if (w != null && h != null) {
        try {
            float weight = Float.parseFloat(w);
            float height = Float.parseFloat(h);
            float bmi = weight / (height * height);

            out.println("<h3>Your BMI: " + bmi + "</h3>");

            if (bmi >= 18.5 && bmi <= 24.9) {
                out.println("<h3 style='color:green'>Your health is good</h3>");
            } else {
                out.println("<h3 style='color:red'>Your BMI is not in normal range</h3>");
            }
        } catch (Exception e) {
            out.println("<h3 style='color:red'>Invalid input</h3>");
        }
    }
%>

</body>
</html>
