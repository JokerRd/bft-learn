Ext.define('Constructor.views.ConstructorTest', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.constructor-test',
    controller: 'test-controller',
    requires: [
        'Constructor.views.configurationTest.ConfigurationTestSideBar',
        'Constructor.views.editorQuestions.EditorQuestions',
        'Constructor.views.LeftBorderPanel',
        'Constructor.controllers.TestController'
    ],
    title: 'Создание теста',
    width: '80%',
    height: '100%',
    margin: '5 5 5 5',
    layout: 'border',
    items: [
        {
            xtype: 'left-border-panel'
        },
        {
            xtype: 'editor-questions'
        }
    ]
});



