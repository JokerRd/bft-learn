let testViewModel = Ext.create('Constructor.viewModel.TestViewModel');

Ext.define('Constructor.views.LeftBorderPanel', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.left-border-panel',
    requires: [
        'Constructor.views.configurationTest.ConfigurationTestSideBar',
        'Constructor.views.SaveTestButton',
        'Constructor.controllers.TestController'
    ],
    controller: 'test-controller',
    viewModel: testViewModel,
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