<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: v.konkov
  Date: 07.09.2021
  Time: 9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<footer class="footer footer-color">
    <div class="footer-flexbox">
        <div class="footer-contact">
            <h2>Телефон</h2>
            <p>+79223664973</p>
        </div>
        <div class="footer-contact">
            <h2>Телеграм</h2>
            <p>@vakonkov</p>
        </div>
        <div class="footer-contact">
            <h2>Почта</h2>
            <p>v.a.konkov@mail.ru</p>
        </div>
    </div>
    <div class="footer-additional">
        <div class="language">
            Смена языка: <span class="language-button language-ru language-active">
            <span class="tooltip"><img class="tooltip-language-img" src="<c:url value="component/img/ru.png"/>" alt="ru"></span>ru</span>
            /
            <span class="language-button language-en">
                <span class="tooltip">
                    <img class="tooltip-language-img" src="<c:url value="component/img/en.png"/>" alt="en">
                </span>
                en
            </span>
        </div>
        <time class="time"></time>
    </div>
</footer>
</body>
</html>
