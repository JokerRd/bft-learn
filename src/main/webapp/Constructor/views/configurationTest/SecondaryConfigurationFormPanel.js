Ext.define('Constructor.views.configurationTest.SecondaryConfigurationFormPanel', {
    extend: 'Ext.form.Panel',
    alias: 'widget.secondary-config-form',
    title: "Дополнительные настройки",
    reference: 'secondary-config',
    bodyPadding: 10,
    items: [
        {
            xtype: 'checkboxfield',
            fieldLabel: 'Показывать результаты?',
            bind: '{test.isShowResult}'
        }
    ]
})