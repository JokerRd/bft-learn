Ext.define('Constructor.views.ConstructorTest', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.constructor-test',
    requires: [
        'Constructor.views.configurationTest.ConfigurationTestSideBar',
        'Constructor.views.editorQuestions.EditorQuestions'
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
            xtype: 'editor-questions'
        }
    ]
});



