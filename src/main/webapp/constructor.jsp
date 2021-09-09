<%--
  Created by IntelliJ IDEA.
  User: v.konkov
  Date: 09.09.2021
  Time: 12:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8" name="Vlad" content="Простой опросник">
    <link rel="stylesheet" href="scripts/ext-js/themes/theme-neptune/resources/theme-neptune-all.css"/>
    <script type="text/javascript" src="scripts/ext-js/js/ext-all.js"></script>
    <script type="text/javascript" src="scripts/ext-js/js/ext-all-debug.js"></script>
    <script type="text/javascript" src="scripts/ext-js/js/ext-locale-ru.js"></script>
    <script type="application/javascript">
        Ext.application({
            name: 'More',
            extend: 'Ext.app.Application',
            launch: function(){
                Ext.create('Constructor.views.Main',{
                    renderTo: 'body'
                });
            }
        });
    </script>
    <title>Конструктор опросов</title>
</head>
<body id="body">
</body>
</html>
