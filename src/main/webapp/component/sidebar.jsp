<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: v.konkov
  Date: 07.09.2021
  Time: 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<div id="sidebar-slide-left" class="sidebar-container-absolute">
    <aside class="sidebar">
        <p class="sidebar-header"> Полезные ссылки</p>
        <ul class="list">
            <li><a href="http://htmlbook.ru/">Htmlbook</a></li>
            <li><a href="https://developer.mozilla.org/ru/docs/Learn/Getting_started_with_the_web/CSS_basics"> Основы
                CSS</a></li>
            <li><a href="https://learn.javascript.ru/">Уроки JavaScript</a></li>
        </ul>
        <button class="sidebar-button sidebar-button-close">
            Закрыть
        </button>
    </aside>
</div>
<div class="sidebar-button-open-container-absolute">
    <button id="sidebar-button-slide-left" class="sidebar-button reset-button sidebar-button-open">
        <img class="sidebar-button-background" src="<c:url value="component/img/arrow2.png"/>" alt="arrow">
    </button>
</div>
</body>
</html>
