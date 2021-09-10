Ext.define('Constructor.views.PrimaryConfigurationFormPanel', {
    extend: 'Ext.form.Panel',
    alias: 'widget.primary-config-form',
    title: "Основные настройки",
    bodyPadding: 10,
    items: [
        {
            xtype: 'textfield',
            fieldLabel: 'Название теста',
            name: 'nameTest'
        },
        {
            xtype: 'textareafield',
            fieldLabel: 'Описание теста',
            name: 'descriptionTest'
        }
    ]
})