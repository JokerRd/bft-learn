Ext.define("Constructor.views.ConfigurationQuestionPanel", {
    extend: 'Ext.grid.Panel',
    alias: 'widget.question-grid',
    title: 'Вопросы',
    width: '70%',
    height: '100%',
    region: 'east',
    columns: [
        { text: 'Название вопроса', dataIndex: 'name' },
        { text: 'Тип вопроса', dataIndex: 'name' },
        { text: 'Описание вопроса', dataIndex: 'name' }
    ]
})