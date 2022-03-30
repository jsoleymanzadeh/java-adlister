<%--
  Created by IntelliJ IDEA.
  User: jaspersoleymanzadeh
  Date: 30/03/22
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="POST" action="/login.jsp">
        <div>
            <label>Username<input type="text" name="username"></label>
        </div>
        <div>
            <label>Password<input type="password" name="password"></label>
        </div>
        <div>
            <button type="submit">Login</button>
        </div>
    </form>
    <%if (request.getParameter("username") != null) {
        if (request.getParameter("username").equals("admin") && request.getParameter("password").equals("password")) {
            response.sendRedirect("/profile.jsp");
        }
    }%>
</body>
</html>