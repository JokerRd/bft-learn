Ext.define('Constructor.views.editorQuestions.configurationQuestions.buttons.UpdateQuestionButton', {
    extend: 'Ext.Button',
    alias: 'widget.update-question-btn',
    text: 'Сохранить вопрос',
    margin: '5 5 5 5',
    width: 100,
    height: 50,
    listeners: {
        click: 'onUpdateQuestionClick'
    }
})