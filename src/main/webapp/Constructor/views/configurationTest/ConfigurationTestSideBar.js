Ext.define("Constructor.views.configurationTest.ConfigurationTestSideBar", {
    extend: 'Ext.tab.Panel',
    alias: "widget.config-sidebar",
    requires: [
        'Constructor.views.configurationTest.PrimaryConfigurationFormPanel',
        'Constructor.views.configurationTest.SecondaryConfigurationFormPanel'
    ],
    title: "Настройки теста",
    width: '30%',
    height: '100%',
    region: 'west',
    layout: {
        type: 'vbox',
        align: 'stretch',

    },

    items: [
        {
            xtype: 'primary-config-form'
        },
        {
            xtype: 'secondary-config-form'
        }
    ]
})