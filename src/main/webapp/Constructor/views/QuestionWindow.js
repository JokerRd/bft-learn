Ext.define('Constructor.views.QuestionsWindow', {
    extend: 'Ext.window.Window',
    alias: 'widget.question-window',
    requires: [
        'Constructor.views.configurationQuestions.QuestionsPanel'
    ],
    height: 500,
    width: 500,
    layout: 'fit',
    items: [
        {
            xtype: 'questions'
        }
    ]
})