let testStore = Ext.create('Constructor.stores.TestStore');

Ext.define("Constructor.views.configurationTest.ConfigurationTestSideBar", {
    extend: 'Ext.tab.Panel',
    alias: "widget.config-sidebar",
    requires: [
        'Constructor.views.configurationTest.PrimaryConfigurationFormPanel',
        'Constructor.views.configurationTest.SecondaryConfigurationFormPanel'
    ],
    store: testStore,
    title: "Настройки теста",
    items: [
        {
            xtype: 'primary-config-form'
        },
        {
            xtype: 'secondary-config-form'
        }
    ]
})