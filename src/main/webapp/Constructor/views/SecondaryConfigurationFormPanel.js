Ext.define('Constructor.views.SecondaryConfigurationFormPanel', {
    extend: 'Ext.form.Panel',
    alias: 'widget.secondary-config-form',
    title: "Дополнительные настройки",
    bodyPadding: 10,
    items: [
        {
            xtype: 'checkboxfield',
            fieldLabel: 'Показывать результаты теста?',
            name: 'nameTest'
        },
        {
            xtype: 'textareafield',
            fieldLabel: 'Описание теста',
            name: 'descriptionTest'
        }
    ]
})