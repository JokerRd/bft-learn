Ext.define('Constructor.views.configurationQuestions.AnswersFormPanel', {
    extend: 'Ext.form.Panel',
    alias: 'widget.answers-panel',
    requires: [
      'Constructor.views.configurationQuestions.buttons.AddAnswerButton'
    ],
    title: "Варианты ответов",
    bodyPadding: 15,
    items: [
        {
            xtype: 'textfield',
            fieldLabel: "Ответ"
        },
        {
            xtype: 'add-answer-btn'
        }
    ]
})