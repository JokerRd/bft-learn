Ext.define('Constructor.views.ConstructorTest', {
    extend: 'Ext.panel.Panel',
    alias: 'constructor-test',
    requires: [
        'Constructor.views.configurationTest.ConfigurationTestSideBar',
        'Constructor.views.configurationQuestions.ConfigurationQuestionPanel',
    ],
    title: 'Создание теста',
    width: '80%',
    height: '100%',
    margin: '5 5 5 5',
    layout: 'border',
    items: [
        {
            xtype: 'config-sidebar'
        },
        {
            xtype: 'config-question'
        }
    ]
});



