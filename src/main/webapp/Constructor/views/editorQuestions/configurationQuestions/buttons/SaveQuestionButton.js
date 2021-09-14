Ext.define('Constructor.views.editorQuestions.configurationQuestions.buttons.SaveQuestionButton', {
    extend: 'Ext.Button',
    alias: 'widget.save-question-btn',
    text: 'Сохранить вопрос',
    margin: '5 5 5 5',
    width: 100,
    height: 50,
    listeners: {
        click: 'onSaveQuestionClick'
    }
})