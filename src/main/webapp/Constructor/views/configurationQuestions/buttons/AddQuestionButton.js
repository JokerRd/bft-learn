Ext.define('Constructor.views.configurationQuestions.buttons.AddQuestionButton', {
    extend: 'Ext.Button',
    alias: 'widget.add-question-btn',
    text: 'Добавить вопрос',
    margin: '5 5 5 5',
    height: 50,
    listeners: {
        click: 'onAddQuestionClick'
    }
})