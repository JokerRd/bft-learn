Ext.define('Constructor.controllers.configurationQuestions.EditorQuestionsController', {
    extend: 'Ext.app.ViewController',
    alias: 'controller.editor-questions-controller',
    onAddQuestionClick: function () {
        let window = Ext.create('Constructor.views.editorQuestions.QuestionWindow');
        window.show();
    },
    onEditQuestionDoubleClick: function (dv, record, item, index, e) {
        console.log(dv);
    }
});
