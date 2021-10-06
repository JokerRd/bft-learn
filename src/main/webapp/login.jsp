<%--
  Created by IntelliJ IDEA.
  User: v.konkov
  Date: 06.10.2021
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>Login</title>
</head>
<body>
<h1>Авторизация</h1>
<form name='f' th:action="@{/login}" method='POST'>
    <div th:if="${param.error}">
        Invalid username and password.
    </div>
    <div th:if="${param.logout}">
        You have been logged out.
    </div>
    <table>
        <tr>
            <td>Имя пользователя:</td>
            <td><input type='text' name='username' value=''></td>
        </tr>
        <tr>
            <td>Пароль:</td>
            <td><input type='password' name='password'/></td>
        </tr>
        <tr>
            <td><input name="submit" type="submit" value="Подтвердить"/></td>
        </tr>
    </table>
</form>
</body>
</html>
