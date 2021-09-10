Ext.define('Constructor.views.Main', {
    alias: 'main',
    extend: 'Ext.panel.Panel',
    requires: [
        'Constructor.views.ConstructorTest'
    ],
    title: 'Конструктор опросов',
    width: '100%',
    height: '100%',
    layout: {
        type: 'center'
    },
    items: [
        Ext.create('Constructor.views.ConstructorTest')
    ]
});
