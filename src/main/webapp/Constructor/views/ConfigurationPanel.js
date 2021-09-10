Ext.define('Constructor.views.ConfigurationPanel', {
    extend: 'Ext.tab.Panel',
    alias: 'widget.config-panel',
    title: "Настройка",
    constructor: function (title, items) {
        this.callParent([title, items]);
    }
})