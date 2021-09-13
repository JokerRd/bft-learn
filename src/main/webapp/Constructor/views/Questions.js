Ext.define('Constructor.views.Questions', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.questions-panel',
    requires: [
        'Constructor.views.QuestionsGrid',
        'Constructor.views.QuestionsToolbar'
    ],
    title: 'Редактирование вопросов',
    width: '70%',
    height: '100%',
    region: 'east',
    items: [
        {
            xtype: 'question-toolbar'
        },
        {
            xtype: 'questions-grid'
        }
    ]
})