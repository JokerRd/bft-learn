Ext.define('Constructor.views.editorQuestions.configurationQuestions.QuestionsPanel', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.questions',
    requires: [
        'Constructor.views.editorQuestions.configurationQuestions.QuestionFormPanel',
    ],
    width: '100%',
    reference: 'questions',
    bodyPadding: 15,
    items: [
        {
            xtype: 'question'
        }
    ]
})