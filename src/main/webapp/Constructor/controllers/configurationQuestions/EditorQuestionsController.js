Ext.define('Constructor.controllers.configurationQuestions.EditorQuestionsController', {
    extend: 'Ext.app.ViewController',
    alias: 'controller.editor-questions-controller',
    onAddQuestionClick:function ()  {
        let questions = this.lookupReference('questions');
        questions.add({
            xtype: 'question'
        })
    }
});