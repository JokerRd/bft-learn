Ext.define('Constructor.views.editorQuestions.QuestionWindow', {
    extend: 'Ext.window.Window',
    alias: 'widget.question-window',
    requires: [
        'Constructor.views.editorQuestions.configurationQuestions.QuestionsPanel'
    ],
    reference: 'question-window',
    height: 500,
    width: 500,
    layout: 'fit',
    items: [
        {
            xtype: 'questions'
        }
    ]
});

