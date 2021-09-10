Ext.define('Constructor.views.ConstructorTest', {
    extend: 'Ext.panel.Panel',
    alias: 'constructor-test',
    requires: [
        'Constructor.views.ConfigurationSideBar',
        'Constructor.views.ConfigurationQuestionPanel',
        'Constructor.views.AddQuestionButton'
    ],
    title: 'Создание теста',
    width: '70%',
    height: '100%',
    margin: '5 5 5 5',
    layout: 'border',
    items: [
        {
            xtype: 'config-sidebar'
        },
        {
            xtype: 'question'
        }
    ]
});



