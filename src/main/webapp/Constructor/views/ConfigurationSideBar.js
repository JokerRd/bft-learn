
Ext.define("Constructor.views.ConfigurationSideBar", {
    extend: 'Ext.tab.Panel',
    alias: "config-sidebar",
    title: "Настройки теста",
    width: '30%',
    height: '100%',
    region: 'west',
    layout: {
        type: 'vbox',
        align: 'stretch',

    },

    items: [
        Ext.create('Ext.tab.Panel', {
            title: 'Настройка 1',
        }),
        Ext.create('Ext.tab.Panel', {
            title: 'Настройка 1',
        })
    ]
})