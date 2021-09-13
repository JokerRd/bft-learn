Ext.define('Constructor.views.editorQuestions.QuestionWindow', {
    extend: 'Ext.window.Window',
    alias: 'widget.question-window',
    requires: [
        'Constructor.views.editorQuestions.configurationQuestions.QuestionsPanel'
    ],
    reference: 'question-window',
    height: "90vh",
    width: '70vw',
    layout: 'fit',
    items: [
        {
            xtype: 'questions'
        }
    ]
});

