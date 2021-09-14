Ext.define('Constructor.views.editorQuestions.QuestionWindow', {
    extend: 'Ext.window.Window',
    alias: 'widget.question-window',
    controller: 'window-question-controller',
    requires: [
        'Constructor.views.editorQuestions.configurationQuestions.buttons.SaveQuestionButton',
        'Constructor.controllers.configurationQuestions.WindowQuestionController',
        'Constructor.views.editorQuestions.configurationQuestions.QuestionFormPanel'
    ],
    reference: 'question-window',
    height: "90vh",
    width: '70vw',
    layout: 'vbox',
    items: [
        {
            xtype: 'question'
        },
        {
            xtype: 'save-question-btn',
            handler: 'onSaveQuestionClick'
        }

    ],
});

