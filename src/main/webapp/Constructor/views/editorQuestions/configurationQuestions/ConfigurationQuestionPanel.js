Ext.define("Constructor.views.editorQuestions.configurationQuestions.ConfigurationQuestionPanel", {
    extend: 'Ext.panel.Panel',
    alias: 'widget.config-question',
    requires: [
        'Constructor.views.editorQuestions.configurationQuestions.QuestionsPanel',
    ],
    title: 'Вопросы',
    width: '70%',
    height: '100%',
    region: 'east',
    layout: 'vbox',
    bodyPadding: 10,
    items: [
        {
            xtype: 'questions'
        }
    ]
})