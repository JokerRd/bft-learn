Ext.define('Constructor.views.ConfigurationFormPanel', {
    extend: 'Ext.form.Panel',
    alias: 'widget.config-from',
    items: [
        {
            xtype: 'textfield',
            fieldLabel: 'Название теста',
            name: 'nameTest'
        }
    ]
})