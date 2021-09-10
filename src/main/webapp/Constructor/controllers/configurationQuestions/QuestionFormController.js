Ext.define('Constructor.controllers.configurationQuestions.QuestionFormController', {
    extend: 'Ext.app.ViewController',
    alias: 'controller.question-form-control',
    onAddAnswerClick: function () {
        let answers = this.lookupReference('answers');
        answers.add({
            xtype: 'textfield',
            fieldLabel: 'Ответ'
        });
    }
});