<%--
  Created by IntelliJ IDEA.
  User: jaspersoleymanzadeh
  Date: 30/03/22
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <%@ include file="partials/navbar.jsp" %>
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
    <c:if test="${not empty param.username}">
        <p>Incorrect login.</p>
        <c:if test="${param.username == 'admin' && param.password == 'password'}">
            <c:redirect url="profile.jsp"/>
        </c:if>
    </c:if>
</body>
</html>