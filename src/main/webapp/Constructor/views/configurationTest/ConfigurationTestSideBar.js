let testViewModel = Ext.create('Constructor.viewModel.TestViewModel');

Ext.define("Constructor.views.configurationTest.ConfigurationTestSideBar", {
    extend: 'Ext.tab.Panel',
    alias: "widget.config-sidebar",
    requires: [
        'Constructor.views.configurationTest.PrimaryConfigurationFormPanel',
        'Constructor.views.configurationTest.SecondaryConfigurationFormPanel'
    ],
    viewModel: testViewModel,
    title: "Настройки теста",
    items: [
        {
            xtype: 'primary-config-form'
        },
        {
            xtype: 'secondary-config-form'
        }
    ],
    listeners: {

    }
})