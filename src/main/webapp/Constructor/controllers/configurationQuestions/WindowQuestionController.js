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
        let answers = form.items.get(3).items.get(0).items.items;
        let answersModel = createAnswerModel(answers);
        let question = Ext.create('Constructor.models.QuestionModel', {
                id: newIdElement,
                nameQuestion: form.items.get(0).getValue(),
                descriptionQuestion: form.items.get(1).getValue(),
                typeQuestion: form.items.get(2).getValue(),
                answers: answersModel
            }
        );
        console.log(form.getIdQuestions())
        if (form.getIdQuestions() === -1) {
            store.add(question);
        } else {
            question.id = form.getIdQuestions();
            let record = store.getById(form.getIdQuestions());
            record.set(question.data);
            record.commit();
            console.log(question.data);
            console.log(record);
        }
        window.close();
    },

    onLoadTest: function (obj, records, successful, operation) {
        console.log(obj);
        console.log(records);
        console.log(successful);
        console.log(operation);
    }
});


function createAnswerModel(answersFromForm){
    let answersModel = []
    if (answersFromForm !== null && answersFromForm.length > 0) {
        let count = 1;
        for (let answer of answersFromForm) {
            let newAnswer = {
                id: count,
                answer: answer.items.get(0).getValue(),
                isRight: answer.items.get(1).getValue()
            }
            count++;
            answersModel.push(newAnswer)
        }
    }
    return answersModel;
}