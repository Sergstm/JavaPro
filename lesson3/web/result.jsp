
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
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
        <tr>
            <td>BMW</td>
            <td><%= session.getAttribute("n1") %></td>
            <td><%= session.getAttribute("n2") %></td>
            <td><%= session.getAttribute("n3") %></td>
            <td><%= session.getAttribute("n4") %></td>
        </tr>
        <tr>
            <td>Audi</td>
            <td><%= session.getAttribute("n5") %></td>
            <td><%= session.getAttribute("n6") %></td>
            <td><%= session.getAttribute("n7") %></td>
            <td><%= session.getAttribute("n8") %></td>
        </tr>
        <tr>
            <td>Mercedes</td>
            <td><%= session.getAttribute("n9") %></td>
            <td><%= session.getAttribute("n10") %></td>
            <td><%= session.getAttribute("n11") %></td>
            <td><%= session.getAttribute("n12") %></td>
        </tr>
    </table>
</div>
<div><a href="index.jsp"><input type="button" value="Return" id="ret"></a></div>
</body>
</html>
