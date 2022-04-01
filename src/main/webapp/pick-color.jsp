<%--
  Created by IntelliJ IDEA.
  User: jaspersoleymanzadeh
  Date: 01/04/22
  Time: 12:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color</title>
</head>
<body>
    <form action="/view-color" method="post">
        <label>Enter your favorite color <input type="text" name="color"></label>
        <button type="submit">Submit Color</button>
    </form>
</body>
</html>