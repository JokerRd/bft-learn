Ext.define('Login.views.LoginForm', {
    extend: 'Ext.form.Panel',
    alias: 'widget.login-form',
    width: "30%",
    height: "50%",
    layout: 'anchor',
    defaults: {
        anchor: '100%'
    },
    title: "Вход",
    items: [{
        xtype: 'textfield',
        fieldLabel: 'Логин',
        name: 'login',
        labelAlign: 'top',
        cls: 'field-margin',
        flex: 1,
        margin: '5 5 5 5'
    }, {
        xtype: 'textfield',
        fieldLabel: 'Пароль',
        name: 'password',
        labelAlign: 'top',
        cls: 'field-margin',
        flex: 1,
        margin: '5 5 5 5'
    }],
    buttons: [{
        text: 'Оправить',
        handler: function () {
            this.getForm().submit({
                url: '/login',
                success: function (form, action) {
                    Ext.MessageBox.alert('Авторизация пройдена. ', action.result.message);
                },
                failure: function (form, action) {
                    Ext.MessageBox.alert('Ошибка авторизации. ', action.result.message);
                }
            });
        }
    }]
});
