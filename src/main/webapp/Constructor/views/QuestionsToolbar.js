Ext.define('Constructor.views.QuestionsToolbar', {
    extend: 'Ext.toolbar.Toolbar',
    alias: 'widget.question-toolbar',
    requires: [
        'Constructor.views.configurationQuestions.buttons.AddQuestionButton'
    ],
    width: '100%',
    items: [
        {
            xtype: 'add-question-btn'
        }
    ]
})