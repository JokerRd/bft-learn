Ext.define('Constructor.views.editorQuestions.configurationQuestions.AnswersFormPanel', {
    extend: 'Ext.form.Panel',
    alias: 'widget.answers-panel',
    requires: [
      'Constructor.views.editorQuestions.configurationQuestions.AnswersPanel'
    ],
    title: "Варианты ответов",
    bodyPadding: 15,
    items: [
        {
            xtype: 'answers'
        },
        {
            xtype: 'add-answer-btn'
        }
    ]
})