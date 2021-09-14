Ext.define('Constructor.controllers.configurationQuestions.EditorQuestionsController', {
    extend: 'Ext.app.ViewController',
    alias: 'controller.editor-questions-controller',
    onAddQuestionClick:function ()  {
        let window = Ext.create('Constructor.views.editorQuestions.QuestionWindow');
        window.show();
    },
    onSaveQuestionClick: function () {
        let form = this.lookupReference('question-form');
        let window = this.lookupReference('question-window');
        let store = Ext.data.StoreManager.lookup('question-store');
        let lastElement = store.last();
        let lastIdElement = lastElement.get('id');
        let newIdElement = lastIdElement + 1;
        console.log(form.items)
        let question = Ext.create('Constructor.models.QuestionModel', {
            id: newIdElement,
            nameQuestion: form.items.get(0).getValue(),
            descriptionQuestion: form.items.get(1).getValue(),
            typeQuestion: form.items.get(2).getValue(),
            answers: {}
        });
        store.add(question);
        console.log(window);
    }
});