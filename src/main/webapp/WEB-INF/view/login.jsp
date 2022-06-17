<%--
  Created by IntelliJ IDEA.
  User: asen
  Date: 6/17/2022
  Time: 12:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<c:if test="${param.error != null}">
    <i>Invalid login or password</i>
</c:if>

<h1>My Custom login page</h1>

    <form:form action="/process-login" method="POST">
        Username : <input type="text" name="username">
        <br/>
        Password : <input type="password" name="password">
        <br/>
        <input type="submit" value="Login">
    </form:form>
</body>
</html>
