Ext.define('Constructor.views.editorQuestions.configurationQuestions.Answer', {
    extend: 'Ext.form.FieldSet',
    alias: 'widget.answer-fieldset',
    title: "Ответ",
    items: [
        {
            xtype: 'textfield',
            fieldLabel: "Введите ответ"
        },
        {
            xtype: 'checkboxfield',
            fieldLabel: "Правильный?"
        }
    ]
})