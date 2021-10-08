Ext.define('Registration.views.RegistrationPanel', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.registration-panel',
    requires: [
        'Registration.views.RegistrationForm'
    ],
    width: '100%',
    height: '100%',
    layout: "center",
    title: "Регистрация",
    items: [
        {
            xtype: 'registration-form'
        }
    ]
})