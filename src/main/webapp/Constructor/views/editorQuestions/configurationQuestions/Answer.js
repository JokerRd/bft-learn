Ext.define('Constructor.views.editorQuestions.configurationQuestions.Answer', {
    extend: 'Ext.form.FieldSet',
    alias: 'widget.answer-fieldset',
    title: "Ответ",
    requires: [
        'Constructor.views.editorQuestions.configurationQuestions.buttons.DeleteAnswerButton'
    ],
    items: [
        {
            xtype: 'textfield',
            fieldLabel: "Введите ответ"
        },
        {
            xtype: 'checkboxfield',
            fieldLabel: "Правильный?"
        },
        {
            xtype: 'delete-answer-btn'
        }
    ]
})