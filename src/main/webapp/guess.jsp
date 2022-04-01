<%--
  Created by IntelliJ IDEA.
  User: jaspersoleymanzadeh
  Date: 01/04/22
  Time: 12:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess</title>
</head>
<body>
  <form action="/guess" method="post">
      <label>Guess a number between 1 and 3: <input type="text" name="input"></label>
      <button type="submit">Submit Guess</button>
  </form>
</body>
</html>