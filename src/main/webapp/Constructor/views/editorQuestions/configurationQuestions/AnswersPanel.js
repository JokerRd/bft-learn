Ext.define('Constructor.views.editorQuestions.configurationQuestions.AnswersPanel', {
    extend: 'Ext.form.Panel',
    alias: 'widget.answers',
    requires: [
        'Constructor.views.editorQuestions.configurationQuestions.buttons.AddAnswerButton',
        'Constructor.views.editorQuestions.configurationQuestions.Answer'
    ],
    reference: 'answers',
    bodyPadding: 15,
    height: 200,
    items: [
        {
            xtype: 'answer-fieldset'
        }
    ]
})