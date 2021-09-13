Ext.define('Constructor.views.editorQuestions.EditorQuestions', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.editor-questions',
    requires: [
        'Constructor.views.editorQuestions.QuestionsGrid',
        'Constructor.views.editorQuestions.EditorToolbar'
    ],
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
        }
    ]
})