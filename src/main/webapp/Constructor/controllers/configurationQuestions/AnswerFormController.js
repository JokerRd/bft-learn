Ext.define('Constructor.controllers.configurationQuestions.AnswerFormController', {
    extend: 'Ext.app.ViewController',
    alias: 'controller.answer-form-control',
    onAddAnswerClick: function () {
        let answers = this.lookupReference('answers');
        answers.add({
            xtype: 'answer-fieldset'
        });
    }
});