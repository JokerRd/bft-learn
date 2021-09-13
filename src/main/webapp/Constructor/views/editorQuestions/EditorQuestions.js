Ext.define('Constructor.views.editorQuestions.EditorQuestions', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.editor-questions',
    requires: [
        'Constructor.views.editorQuestions.QuestionsGrid',
        'Constructor.views.editorQuestions.EditorToolbar',
        'Constructor.controllers.configurationQuestions.EditorQuestionsController',
        'Constructor.views.editorQuestions.QuestionWindow'
    ],
    controller: 'editor-questions-controller',
    title: 'Редактирование вопросов',
    width: '70%',
    height: '100%',
    region: 'east',
    items: [
        {
            xtype: 'editor-toolbar'
        },
        {
            xtype: 'questions-grid'
        },
        {
            xtype: 'question-window'
        }
    ]
})