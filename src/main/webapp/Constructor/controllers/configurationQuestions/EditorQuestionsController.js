Ext.define('Constructor.controllers.configurationQuestions.EditorQuestionsController', {
    extend: 'Ext.app.ViewController',
    alias: 'controller.editor-questions-controller',
    onAddQuestionClick: function () {
        let window = Ext.create('Constructor.views.editorQuestions.QuestionWindow');
        window.show();
    },
    onEditQuestionDoubleClick: function (dv, record, item, index, e) {
        let form = Ext.create('Constructor.views.editorQuestions.configurationQuestions.QuestionFormPanel');
        let id = record.data.id;
        let store = Ext.data.StoreManager.lookup('question-store');
        let element  = store.getById(id);
        console.log(element.data);
        form.getForm().setValues(element.data);
        console.log(form);
        let window = Ext.create('Constructor.views.editorQuestions.QuestionWindow', {
            items: form
        });
        window.show();
    }
});
