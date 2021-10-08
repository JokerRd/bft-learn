
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="scripts/ext-js/themes/theme-neptune/resources/theme-neptune-all.css"/>
    <script type="text/javascript" src="scripts/ext-js/js/ext-all.js"></script>
    <script type="text/javascript" src="scripts/ext-js/js/ext-all-debug.js"></script>
    <script type="text/javascript" src="scripts/ext-js/js/ext-locale-ru.js"></script>
    <script type="application/javascript">
        Ext.application({
            name: 'More1',
            extend: 'Ext.app.Application',
            launch: function(){
                Ext.create('Login.views.LoginPanel',{
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
