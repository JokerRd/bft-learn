Ext.define('Constructor.views.Main', {
    alias: 'main',
    extend: 'Ext.tab.Panel',
    title: 'Главная панель',
    width: 400,
    height: 200,
    layout: 'column',
    items: [
        Ext.create('Ext.tab.Panel', {
            title: 'Панель 1',
            width: 500,
            height: 100,
        }),
        Ext.create('Ext.tab.Panel', {
            title: 'Панель 2',
            height: 100,
        })
    ]
});