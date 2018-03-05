<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>

<div>
    <table class="res" id="tbl">
        <tr><td></td><td>Black</td><td>Red</td><td>White</td><td>Silver</td></tr>
        <tr>
            <td>BMW</td>
            <td><%= session.getAttribute("0") %></td>
            <td><%= session.getAttribute("1") %></td>
            <td><%= session.getAttribute("2") %></td>
            <td><%= session.getAttribute("3") %></td>
        </tr>
        <tr>
            <td>Audi</td>
            <td><%= session.getAttribute("4") %></td>
            <td><%= session.getAttribute("5") %></td>
            <td><%= session.getAttribute("6") %></td>
            <td><%= session.getAttribute("7") %></td>
        </tr>
        <tr>
            <td>Mercedes</td>
            <td><%= session.getAttribute("8") %></td>
            <td><%= session.getAttribute("9") %></td>
            <td><%= session.getAttribute("10") %></td>
            <td><%= session.getAttribute("11") %></td>
        </tr>
    </table>
</div>
<div><a href="index.jsp"><input type="button" value="Return" id="ret"></a></div>
</body>
</html>
