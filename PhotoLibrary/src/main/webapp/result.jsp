<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>Result Page</title>
</head>
<body>

<div align="center">
    <h1>Your photo ID is: ${photo_id}</h1>
    <input type="submit" value="Delete Photo" onclick="window.location='/delete/${photo_id}';">
    <input type="submit" value="Main Page" onclick="window.location='/';">
    <p><img src="${photo_id}" alt="img"></p>
</div>

</body>
</html>