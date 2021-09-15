Ext.define('Constructor.views.editorQuestions.configurationQuestions.buttons.DeleteAnswerButton', {
    extend: 'Ext.Button',
    alias: 'widget.delete-answer-btn',
    text: 'Удалить ответ',
    margin: '5 5 5 5',
    height: 50,
    handler: function () {
        let currentFieldset = this.findParentByType('fieldset');
        let form = currentFieldset.findParentByType('form');
        form.remove(currentFieldset);
    }
})