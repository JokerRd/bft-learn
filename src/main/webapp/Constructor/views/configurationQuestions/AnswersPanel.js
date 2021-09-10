Ext.define('Constructor.views.configurationQuestions.AnswersPanel', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.answers',
    requires: [
        'Constructor.views.configurationQuestions.buttons.AddAnswerButton'
    ],
    reference: 'answers',
    bodyPadding: 15,
    items: [
        {
            xtype: 'textfield',
            fieldLabel: "Ответ"
        }
    ]
})