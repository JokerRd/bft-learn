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
    <meta charset="UTF-8">
    <link rel="stylesheet" href="scripts/ext-js/themes/theme-neptune/resources/theme-neptune-all.css"/>
    <script type="text/javascript" src="scripts/ext-js/js/ext-all.js"></script>
    <script type="text/javascript" src="scripts/ext-js/js/ext-all-debug.js"></script>
    <script type="text/javascript" src="scripts/ext-js/js/ext-locale-ru.js"></script>
    <script type="application/javascript">
        Ext.application({
            name: 'MoreMore',
            extend: 'Ext.app.Application',
            launch: function(){
                Ext.create('Registration.views.RegistrationPanel',{
                    renderTo: 'bodys'
                });
            }
        });
    </script>
</head>
<body id="bodys">
</body>
</html>
