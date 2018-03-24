<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>Document</title>
</head>
<body>

<div align="center">
    <input type="submit" value="Main Page" onclick="window.location='/';"><br>
    <c:if test="${empty photo_ids}">
        <br><h1>List is Empty</h1><br>
    </c:if>
    <form action="/del_group" method="post">
        <c:forEach items="${photo_ids}" var="photo_id">
            <h2>
                <a href="${photo_id}">${photo_id}</a>
                <input type="checkbox" name="photo_id" value="${photo_id}">
            </h2>
        </c:forEach>
        <input type="submit" value="Del Photos" onclick="window.location='/del_group';">
    </form>

</div>

</body>
</html>