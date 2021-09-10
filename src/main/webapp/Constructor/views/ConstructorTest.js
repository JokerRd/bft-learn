Ext.define('Constructor.views.ConstructorTest', {
    extend: 'Ext.panel.Panel',
    alias: 'constructor-test',
    requires: [
        'Constructor.views.ConfigurationSideBar',
        'Constructor.views.ConfigurationQuestionPanel'
    ],
    title: 'Создание теста',
    width: '70%',
    height: '100%',
    margin: '5 5 5 5',
    layout: 'border',
    items: [
        Ext.create('Constructor.views.ConfigurationSideBar'),
        Ext.create('Constructor.views.ConfigurationQuestionPanel')
    ]
});


