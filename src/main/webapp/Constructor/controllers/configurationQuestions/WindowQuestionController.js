Ext.define('Constructor.controllers.configurationQuestions.WindowQuestionController', {
    extend: 'Ext.app.ViewController',
    alias: 'controller.window-question-controller',
    onSaveQuestionClick: function () {
        let form = this.lookupReference('question-form');
        let window = form.findParentByType('window');
        let store = Ext.data.StoreManager.lookup('question-store');
        let answers = form.items.get(3).items.get(0).items.items;
        let answersModel = createAnswerModel(answers);
        let question = Ext.create('Constructor.models.QuestionModel', {
                idTest: 1,
                nameQuestion: form.items.get(0).getValue(),
                descriptionQuestion: form.items.get(1).getValue(),
                typeQuestion: form.items.get(2).getValue(),
                answers: answersModel
            }
        );
        console.log(form.getIdQuestions())
        if (form.getIdQuestions() !== -1) {
            question.phantom = false;
            question.set('id', form.getIdQuestions());
        }
        question.save({
            success: function (){
                location.reload();
            }
        });
        window.close();
    }
});


function createAnswerModel(answersFromForm) {
    let answersModel = []
    if (answersFromForm !== null && answersFromForm.length > 0) {
        let count = 1;
        for (let answer of answersFromForm) {
            let newAnswer = {
                answer: answer.items.get(0).getValue(),
                isRight: answer.items.get(1).getValue()
            }
            count++;
            answersModel.push(newAnswer)
        }
    }
    return answersModel;
}