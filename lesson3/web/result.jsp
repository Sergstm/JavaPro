
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>

<%!
    private int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12 = 0;
%>
<%
    String car = String.valueOf(session.getAttribute("car"));
    String color = String.valueOf(session.getAttribute("color"));

    if (car.equals("bmw") && color.equals("black")) n1++;
    if (car.equals("bmw") && color.equals("red")) n2++;
    if (car.equals("bmw") && color.equals("white")) n3++;
    if (car.equals("bmw") && color.equals("silver")) n4++;

    if (car.equals("audi") && color.equals("black")) n5++;
    if (car.equals("audi") && color.equals("red")) n6++;
    if (car.equals("audi") && color.equals("white")) n7++;
    if (car.equals("audi") && color.equals("silver")) n8++;

    if (car.equals("mercedes") && color.equals("black")) n9++;
    if (car.equals("mercedes") && color.equals("red")) n10++;
    if (car.equals("mercedes") && color.equals("white")) n11++;
    if (car.equals("mercedes") && color.equals("silver")) n12++;
%>

<div>
    <table class="res">
        <tr><td>Name:</td><td><%= session.getAttribute("name")%></td></tr>
        <tr><td>Age:</td><td><%= session.getAttribute("age")%></td></tr>
        <tr><td>Car:</td><td><%= session.getAttribute("car")%></td></tr>
        <tr><td>Color:</td><td><%= session.getAttribute("color")%></td></tr>
    </table>
</div>

<div>
    <table class="res" id="tbl">
        <tr><td></td><td>Black</td><td>Red</td><td>White</td><td>Silver</td></tr>
        <tr><td>BMW</td><td><%= n1 %></td><td><%= n2 %></td><td><%= n3 %></td><td><%= n4 %></td></tr>
        <tr><td>Audi</td><td><%= n5 %></td><td><%= n6 %></td><td><%= n7 %></td><td><%= n8 %></td></tr>
        <tr><td>Mercedes</td><td><%= n9 %></td><td><%= n10 %></td><td><%= n11 %></td><td><%= n12 %></td></tr>
    </table>
</div>
<div><a href="index.jsp"><input type="button" value="Return" id="ret"></a></div>
</body>
</html>
