

Ext.define("Constructor.views.configurationTest.ConfigurationTestSideBar", {
    extend: 'Ext.tab.Panel',
    alias: "widget.config-sidebar",
    requires: [
        'Constructor.views.configurationTest.PrimaryConfigurationFormPanel',
        'Constructor.views.configurationTest.SecondaryConfigurationFormPanel'
    ],
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
        initialize: 'onInitializeSettingsTest'
    }
})