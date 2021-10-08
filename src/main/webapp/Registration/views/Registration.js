Ext.define('Registration.views.Registration', {
    extend: 'Ext.form.Panel',
    alias: 'widget.login',
    width: "30%",
    height: "50%",
    layout: "center",
    title: "Регистрация",
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
                url: '/registration',
                success: function (form, action) {
                    Ext.MessageBox.alert('Регистрация пройдена. ', action.result.message);
                },
                failure: function (form, action) {
                    Ext.MessageBox.alert('Уже зарегистрированы. ', action.result.message);
                }
            });
        }
    }]
});
