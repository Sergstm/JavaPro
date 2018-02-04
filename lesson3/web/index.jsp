
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Index</title>
  <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<div>
  <form action="Servlet" method="post">
    <table id="title">
      <tr><td>Name:</td><td><input type="text" name="name"></td></tr>
      <tr><td>Age:</td><td><input type="text" name="age"></td></tr>
    </table>
    <table id="car">
      <tr><td>BMW:</td><td><input type="radio" name="car" value="bmw" class="rad"></td></tr>
      <tr><td>Audi:</td><td><input type="radio" name="car" value="audi" class="rad"></td></tr>
      <tr><td>Mercedes:</td><td><input type="radio" name="car" value="mercedes" class="rad"></td></tr>
    </table>
    <table id="color">
      <tr><td>Black:</td><td><input type="radio" name="color" value="black" class="rad"></td></tr>
      <tr><td>Red:</td><td><input type="radio" name="color" value="red" class="rad"></td></tr>
      <tr><td>White:</td><td><input type="radio" name="color" value="white" class="rad"></td></tr>
      <tr><td>Silver:</td><td><input type="radio" name="color" value="silver" class="rad"></td></tr>
    </table>
    <input type="submit" value="Send" id="send">
  </form>
</div>
</body>
</html>
