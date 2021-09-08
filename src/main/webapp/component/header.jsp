<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: v.konkov
  Date: 07.09.2021
  Time: 9:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<header class="header">
    <div class="logo">
        <img class="logo-img logo-img-transition" src="<c:url value="component/img/logo.png"/>" alt="Logo">
    </div>
    <div class="header-description">
        <h1 class="header-name">Опрос</h1>
        <p class="description">
            Опрос предназначен для ознакомления меня с миром верстки и для вас с целью проверить все ли норм.<br>
            Прошу вас отнестись к опросу серьезно и отвечать <strong>правдиво</strong>.
        </p>
    </div>
    <div class="aligner">
        <div class="sign-out sign-out-font">Выйти</div>
    </div>
</header>
</body>
</html>
