Ext.define('Registration.views.RegistrationForm', {
    extend: 'Ext.form.Panel',
    alias: 'widget.registration-form',
    title: "Регистрация",
    layout: 'anchor',
    width: '30%',
    height: '50%',
    defaults: {
        anchor: '100%'
    },
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
                url: '/registration',
                success: function (form, action) {
                    document.location = '/'
                },
                failure: function (form, action) {
                    Ext.MessageBox.alert('Уже зарегистрированы. ', action.result.message);
                }
            });
        }
    }]
});
