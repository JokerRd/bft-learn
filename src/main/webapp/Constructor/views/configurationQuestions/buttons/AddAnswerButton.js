Ext.define('Constructor.views.configurationQuestions.buttons.AddAnswerButton', {
    extend: 'Ext.Button',
    alias: 'widget.add-answer-btn',
    height: 50,
    text: "Добавить ответ",
    listeners: {
        click: 'onAddAnswerClick'
    }
})