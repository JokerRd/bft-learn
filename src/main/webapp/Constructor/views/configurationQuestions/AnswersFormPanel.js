Ext.define('Constructor.views.configurationQuestions.AnswersFormPanel', {
    extend: 'Ext.form.Panel',
    alias: 'widget.answers-panel',
    requires: [
      'Constructor.views.configurationQuestions.AnswersPanel'
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