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
        name: 'username',
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
            let form = this.findParentByType('form');
            form.getForm().submit({
                url: '/login',
                failure: function (form, action) {
                    console.log(action)
                    if (action.response.status === 200) {
                        document.location = "/"
                    } else {
                        Ext.MessageBox.alert('Ошибка авторизации');
                    }
                }
            });
        }
    }]
});
