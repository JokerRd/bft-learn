<%--
  Created by IntelliJ IDEA.
  User: v.konkov
  Date: 06.09.2021
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="ru">
<head>
    <meta charset="UTF-8" name="Vlad" content="Простой опросник">
    <link rel="shortcut icon" href="favicon.ico" type="image/x-icon">
    <link href="styles/index.css" rel="stylesheet">
    <link href="styles/header.css" rel="stylesheet">
    <link href="styles/footer.css" rel="stylesheet">
    <link href="styles/sidebar.css" rel="stylesheet">
    <link href="styles/survey.css" rel="stylesheet">
    <script type="text/javascript" src="scripts/footer-time.js/"></script>
    <script type="text/javascript" src="scripts/sidebar.js"></script>
    <script type="text/javascript" src="scripts/survey.js"></script>
    <script type="text/javascript" src="scripts/header-sign-out.js"></script>
    <title>Опросник</title>
</head>
<body class="background relative">
<jsp:include page="component/header.jsp"/>
<jsp:include page="component/sidebar.jsp"/>
<div id="margin-from-sidebar" class="flex-container margin-from-sidebar-off">
    <jsp:include page="component/survey.jsp"/>
</div>
<jsp:include page="component/footer.jsp"/>
</body>
</html>