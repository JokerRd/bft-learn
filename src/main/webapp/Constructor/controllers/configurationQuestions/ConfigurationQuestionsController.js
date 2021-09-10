Ext.define('Constructor.controllers.configurationQuestions.ConfigurationQuestionsController', {
    extend: 'Ext.app.ViewController',
    alias: 'controller.config-questions-control',
    onAddQuestionClick:function ()  {
        let questions = this.lookupReference('questions');
        questions.add({
            xtype: 'question'
        })
    }
});