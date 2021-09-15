Ext.define('Constructor.views.LeftBorderPanel', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.left-border-panel',
    requires: [
        'Constructor.views.configurationTest.ConfigurationTestSideBar',
        'Constructor.views.SaveTestButton'
    ],
    width: '30%',
    region: 'west',
    layout: {
        type: 'vbox',
        align: 'stretch',
    },
    items: [
        {
            xtype: 'config-sidebar'
        }
    ],
    dockedItems: [
        {
            xtype: 'save-test-btn',
            dock: 'bottom'
        }
    ]
})