Ext.define('Constructor.views.editorQuestions.EditorToolbar', {
    extend: 'Ext.toolbar.Toolbar',
    alias: 'widget.editor-toolbar',
    requires: [
        'Constructor.views.editorQuestions.buttons.AddQuestionButton'
    ],
    width: '100%',
    items: [
        {
            xtype: 'add-question-btn'
        }
    ]
})