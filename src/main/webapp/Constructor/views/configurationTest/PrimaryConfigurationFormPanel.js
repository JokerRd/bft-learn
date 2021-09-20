Ext.define('Constructor.views.configurationTest.PrimaryConfigurationFormPanel', {
    extend: 'Ext.form.Panel',
    alias: 'widget.primary-config-form',
    title: "Основные настройки",
    reference: 'primary-config',
    bodyPadding: 10,
    items: [
        {
            xtype: 'textfield',
            fieldLabel: 'Название теста',
            name: 'nameTest',
            bind: '{test.nameTest}'
        },
        {
            xtype: 'textareafield',
            fieldLabel: 'Описание теста',
            name: 'descriptionTest',
            bind: '{test.descriptionTest}'
        }
    ]
})