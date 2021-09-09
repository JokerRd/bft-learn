Ext.define('Constructor.views.Main', {
    alias: 'main',
    extend: 'Ext.panel.Panel',
    title: 'Конструктор опросов',
    layout: 'center',
    items: [
        Ext.create('Ext.panel.Panel', {
            title: 'Создание теста',
            width: '70%',
            height: '100%',
            margin: '5 5 5 5'
        })
    ]
});
