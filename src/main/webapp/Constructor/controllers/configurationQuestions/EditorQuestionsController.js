Ext.define('Constructor.controllers.configurationQuestions.EditorQuestionsController', {
    extend: 'Ext.app.ViewController',
    alias: 'controller.editor-questions-controller',
    onAddQuestionClick: function () {
        let window = Ext.create('Constructor.views.editorQuestions.QuestionWindow');
        window.show();
    },
    onEditQuestionDoubleClick: function (dv, record, item, index, e) {
        let id = record.data.id;
        let store = Ext.data.StoreManager.lookup('question-store');
        let element = store.getById(id);
        let answers = createAnswerForForm(element.data.answers);
        let answerForm = Ext.create('Constructor.views.editorQuestions.configurationQuestions.AnswersPanel', {
            items: answers
        });
        let form = Ext.create('Constructor.views.editorQuestions.configurationQuestions.QuestionFormPanel');
        form.getForm().setValues(element.data);
        form.setIdQuestions(id);
        let answerPanel = form.items.last();
        answerPanel.remove(0);
        answerPanel.insert(0, answerForm);
        let window = Ext.create('Constructor.views.editorQuestions.QuestionWindow', {
            items: [
                form,
                Ext.create('Constructor.views.editorQuestions.configurationQuestions.buttons.SaveQuestionButton')
            ]
        });
        window.show();
    }
});


function createAnswerForForm(answers) {
    let fieldsets = [];
    if (answers !== null && answers.length > 0) {
        for (let answer of answers) {
            let fieldset = Ext.create('Constructor.views.editorQuestions.configurationQuestions.Answer', {
                items: [
                    {
                        xtype: 'textfield',
                        fieldLabel: "Введите ответ",
                        value: answer.answer
                    },
                    {
                        xtype: 'checkboxfield',
                        fieldLabel: "Правильный?",
                        value: answer.isRight
                    },
                    Ext.create('Constructor.views.editorQuestions.configurationQuestions.buttons.DeleteAnswerButton')
                ]
            });
            fieldsets.push(fieldset);
        }
    }
    return fieldsets;
}