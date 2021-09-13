Ext.define('Constructor.views.editorQuestions.configurationQuestions.QuestionFormPanel', {
    extend: 'Ext.form.Panel',
    alias: 'widget.question',
    requires: [
        'Constructor.views.editorQuestions.configurationQuestions.TypeQuestionComboBox',
        'Constructor.views.editorQuestions.configurationQuestions.AnswersFormPanel',
        'Constructor.views.editorQuestions.configurationQuestions.buttons.DeleteQuestionButton',
        'Constructor.controllers.configurationQuestions.QuestionFormController'
    ],
    title: 'Вопрос',
    width: '100%',
    bodyPadding: 15,
    controller: 'question-form-control',
    items: [
        {
            xtype: 'textfield',
            fieldLabel: 'Название вопроса',
            name: 'nameQuestion'
        },
        {
            xtype: 'textareafield',
            fieldLabel: 'Описание вопроса',
            name: 'descriptionQuestion'
        },
        {
            xtype: 'type-question'
        },
        {
            xtype: 'answers-panel',
        },
        {
            xtype: 'delete-question-btn'
        }
    ]
})