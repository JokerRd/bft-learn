let questionsGrid = Ext.create('Constructor.stores.QuestionStore');

Ext.define('Constructor.views.editorQuestions.QuestionsGrid', {
    extend: 'Ext.grid.Panel',
    alias: 'widget.questions-grid',
    title: 'Вопросы',
    width: '100%',
    store: questionsGrid,
    columns: [
        {
            header: 'Название вопроса',
            dataIndex: 'nameQuestion'
        },
        {
            header: 'Тип вопроса',
            dataIndex: 'typeQuestion'
        }
    ]
})