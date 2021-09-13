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
            xtype: 'rownumberer'
        },
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
            width: 32,
            items: [{
                icon: 'Constructor/resources/del.png',
                handler: function (grid, rowIndex, colIndex) {
                    console.log(grid);
                    questionsGrid.removeAt(rowIndex);
                }
            }]
        }
    ]
})