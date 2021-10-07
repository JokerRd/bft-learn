Ext.define('Login.views.Login', {
    extend: 'Ext.form.Panel',
    alias: 'widget.login',
    width: "30%",
    height: "50%",
    layout: "center",
    items: [{
        xtype: 'textfield',
        fieldLabel: 'Логин',
        name: 'login',
        labelAlign: 'top',
        cls: 'field-margin',
        flex: 1
    }, {
        xtype: 'textfield',
        fieldLabel: 'Пароль',
        name: 'password',
        labelAlign: 'top',
        cls: 'field-margin',
        flex: 1
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
