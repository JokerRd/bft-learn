let questionsGrid = Ext.create('Constructor.stores.QuestionStore');

Ext.define('Constructor.views.editorQuestions.QuestionsGrid', {
    extend: 'Ext.grid.Panel',
    alias: 'widget.questions-grid',
    title: 'Вопросы',
    width: '100%',
    height: 500,
    store: questionsGrid,
    columns: [
        {
            header: 'Название вопроса',
            dataIndex: 'nameQuestion'
        },
        {
            header: 'Тип вопроса',
            dataIndex: 'typeQuestion'
        },
        {
            xtype: 'actioncolumn',
            width:40,
            items:[{
                icon:'del.png',
                handler:function (grid, rowIndex, colIndex) {
                    store.removeAt(rowIndex);
                }
            }]
        }
    ]
})