Ext.define('Login.views.LoginPanel', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.login-panel',
    requires: [
        'Login.views.LoginForm'
    ],
    width: '100%',
    height: '100%',
    layout: "center",
    title: "Вход",
    items: [
        {
            xtype: 'login-form'
        }
    ]
})