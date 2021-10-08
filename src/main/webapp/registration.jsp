<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="scripts/ext-js/themes/theme-neptune/resources/theme-neptune-all.css"/>
    <script type="text/javascript" src="scripts/ext-js/js/ext-all.js"></script>
    <script type="text/javascript" src="scripts/ext-js/js/ext-all-debug.js"></script>
    <script type="text/javascript" src="scripts/ext-js/js/ext-locale-ru.js"></script>
    <script type="application/javascript">
        Ext.application({
            name: 'Reg',
            extend: 'Ext.app.Application',
            launch: function(){
                Ext.create('Registration.views.Registration',{
                    renderTo: 'body1'
                });
            }
        });
    </script>
    <title>Регистрация</title>
</head>

<body id="body1">
</body>
</html>