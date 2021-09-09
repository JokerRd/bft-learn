Ext.define('Constructor.views.ConstructorTest', {
    extend: 'Ext.panel.Panel',
    alias: 'constructor-test',
    requires: [
        'Constructor.views.ConfigurationSideBar'
    ],
    title: 'Создание теста',
    width: '70%',
    height: '100%',
    margin: '5 5 5 5',
    layout: 'border',
    items: [
        Ext.create('Constructor.views.ConfigurationSideBar')
    ]
});



