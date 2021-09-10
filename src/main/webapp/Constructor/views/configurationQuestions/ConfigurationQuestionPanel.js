Ext.define("Constructor.views.configurationQuestions.ConfigurationQuestionPanel", {
    extend: 'Ext.panel.Panel',
    alias: 'widget.question',
    requires: [
        'Constructor.views.configurationQuestions.AddQuestionButton'
    ],
    title: 'Вопросы',
    width: '70%',
    height: '100%',
    region: 'east',
    layout: 'column',
    items: [
        {
            xtype: 'add-question-btn'
        }
    ]
})