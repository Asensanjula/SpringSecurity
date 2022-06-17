<%--
  Created by IntelliJ IDEA.
  User: asen
  Date: 6/12/2022
  Time: 4:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Spring Security</title>
</head>
<body>
<p>Spring Security Rocks</p>

<form:form action="logout" method="POST">
    <input type="submit" value="logout">
</form:form>
</body>
</html>
