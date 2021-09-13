Ext.define('Constructor.controllers.configurationQuestions.EditorQuestionsController', {
    extend: 'Ext.app.ViewController',
    alias: 'controller.editor-questions-controller',
    onAddQuestionClick:function ()  {
        let window = this.lookupReference('question-window');
        window.show();
    }
});