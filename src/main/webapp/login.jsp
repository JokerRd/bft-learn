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
    <meta charset="UTF-8" name="login" content="Страница входа">
    <link rel="stylesheet" href="scripts/ext-js/themes/theme-neptune/resources/theme-neptune-all.css"/>
    <script type="text/javascript" src="scripts/ext-js/js/ext-all.js"></script>
    <script type="text/javascript" src="scripts/ext-js/js/ext-all-debug.js"></script>
    <script type="text/javascript" src="scripts/ext-js/js/ext-locale-ru.js"></script>
    <script type="application/javascript">
        Ext.application({
            name: 'AppLogin',
            extend: 'Ext.app.Application',
            launch: function () {
                Ext.create('Login.views.Login', {
                    renderTo: 'body2'
                });
            }
        });
    </script>
    <title>Login</title>
</head>
<body id="body2">
</body>
</html>
