Ext.define('Constructor.views.configurationQuestions.AnswersPanel', {
    extend: 'Ext.form.Panel',
    alias: 'widget.answers',
    requires: [
        'Constructor.views.configurationQuestions.buttons.AddAnswerButton'
    ],
    reference: 'answers',
    bodyPadding: 15,
    defaults: {
        scrollable: true
    },
    height: 200,
    items: [
        {
            xtype: 'textfield',
            fieldLabel: "Ответ"
        }
    ]
})