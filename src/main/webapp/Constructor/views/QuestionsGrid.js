
Ext.define('Constructor.views.QuestionsGrid', {
    extend: 'Ext.grid.Panel',
    alias: 'widget.questions-grid',
    title: 'Вопросы',
    store: Ext.create('Constructor.views.stores.QuestionStore'),
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