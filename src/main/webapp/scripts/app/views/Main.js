Ext.define('Constructor.views.Main', {
    alias: 'main',
    extend: 'Ext.panel.Panel',
    requires: [
        'Constructor.views.ConstructorTest'
    ],
    title: 'Конструктор опросов',
    layout: 'center',
    items: [
        Ext.create('constructor-test')
    ]
});
