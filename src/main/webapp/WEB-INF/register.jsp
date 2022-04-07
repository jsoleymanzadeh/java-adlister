<%--
  Created by IntelliJ IDEA.
  User: jaspersoleymanzadeh
  Date: 07/04/22
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Register" />
    </jsp:include>
</head>
<body>
    <jsp:include page="/WEB-INF/partials/navbar.jsp" />
    <form action="/register" method="POST">
        <div>
            <label>Username <input type="text" id="username" name="username"></label>
        </div>
        <div>
            <label>Email <input type="text" id="email" name="email"></label>
        </div>
        <div>
            <label>Password <input type="password" id="password" name="password"></label>
        </div>
        <div>
            <button type="submit">Register</button>
        </div>
    </form>
</body>
</html>