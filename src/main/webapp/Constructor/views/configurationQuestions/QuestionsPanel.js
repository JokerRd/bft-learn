Ext.define('Constructor.views.configurationQuestions.QuestionsPanel', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.questions',
    requires: [
        'Constructor.views.configurationQuestions.QuestionFormPanel'
    ],
    reference: 'questions',
    bodyPadding: 15,
    items: [
        {
            xtype: 'question'
        }
    ]
})