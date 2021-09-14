Ext.define('Constructor.controllers.configurationQuestions.WindowQuestionController', {
    extend: 'Ext.app.ViewController',
    alias: 'controller.window-question-controller',
    onSaveQuestionClick: function () {
        let form = this.lookupReference('question-form');
        let window = form.findParentByType('window');
        let store = Ext.data.StoreManager.lookup('question-store');
        let lastElement = store.last();
        let lastIdElement = lastElement.get('id');
        let newIdElement = lastIdElement + 1;
        let question = Ext.create('Constructor.models.QuestionModel', {
                id: newIdElement,
                nameQuestion: form.items.get(0).getValue(),
                descriptionQuestion: form.items.get(1).getValue(),
                typeQuestion: form.items.get(2).getValue(),
                answers: {}
            }
        );
        store.add(question);
        window.close();
    }
});