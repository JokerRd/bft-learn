
Ext.define("Constructor.views.ConfigurationSideBar", {
    extend: 'Ext.tab.Panel',
    alias: "config-sidebar",
    requires: [
        'Constructor.views.ConfigurationPanel',
        'Constructor.views.ConfigurationFormPanel'
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
            xtype: 'config-panel',
            title: 'Настройка 1',
            items: [
                {
                    xtype: 'config-from'
                }
            ]
        }
    ]
})