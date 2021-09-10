Ext.define("Constructor.views.configurationQuestions.ConfigurationQuestionPanel", {
    extend: 'Ext.panel.Panel',
    alias: 'widget.config-question',
    requires: [
        'Constructor.views.configurationQuestions.AddQuestionButton',
        'Constructor.views.configurationQuestions.QuestionFormPanel'
    ],
    title: 'Вопросы',
    width: '70%',
    height: '100%',
    region: 'east',
    layout: 'vbox',
    bodyPadding: 10,
    items: [
        {
            xtype: 'question'
        },
        {
            xtype: 'add-question-btn'
        }
    ]
})