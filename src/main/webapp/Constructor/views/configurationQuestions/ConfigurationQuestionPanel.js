Ext.define("Constructor.views.configurationQuestions.ConfigurationQuestionPanel", {
    extend: 'Ext.panel.Panel',
    alias: 'widget.config-question',
    requires: [
        'Constructor.views.configurationQuestions.buttons.AddQuestionButton',
        'Constructor.views.configurationQuestions.QuestionFormPanel',
        'Constructor.views.configurationQuestions.QuestionsPanel',
        'Constructor.controllers.configurationQuestions.ConfigurationQuestionsController',
    ],
    controller: 'config-questions-control',
    title: 'Вопросы',
    width: '70%',
    height: '100%',
    region: 'east',
    layout: 'vbox',
    bodyPadding: 10,
    items: [
        {
            xtype: 'questions'
        },
        {
            xtype: 'add-question-btn'
        }
    ]
})