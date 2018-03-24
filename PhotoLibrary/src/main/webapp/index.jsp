<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>Main Page</title>
</head>
<body>

<div align="center">
    <form action="/view" method="post">
        Photo ID: <input type="text" name="photo_id">
        <input type="submit" value="Send">
    </form>
    <form action="/add_photo" enctype="multipart/form-data" method="post">
        Photo: <input type="file" name="photo">
        <input type="submit" value="Send">
    </form>
    <input type="submit" value="List of Photos" onclick="window.location='/list';">
</div>

</body>
</html>