<%--
  Created by IntelliJ IDEA.
  User: v.konkov
  Date: 06.10.2021
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Авторизация</h1>
<form name='f' action="login" method='POST'>
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
            <td><input name="submit" type="submit" value="submit"/></td>
        </tr>
    </table>
</form>
</body>
</html>
