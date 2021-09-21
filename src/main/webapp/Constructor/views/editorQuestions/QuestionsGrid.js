let questionsGrid = Ext.create('Constructor.stores.QuestionStore');

let questionsViewModel = Ext.create('Constructor.viewModel.QuestionViewModel');

Ext.define('Constructor.views.editorQuestions.QuestionsGrid', {
    extend: 'Ext.grid.Panel',
    alias: 'widget.questions-grid',
    title: 'Вопросы',
    width: '100%',
    height: 500,
    viewModel: questionsViewModel,
    bind: {
        store: '{questions}'
    },
    listeners: {
        itemdblclick: 'onEditQuestionDoubleClick'
    },
    dockedItems: [{
        xtype: 'pagingtoolbar',
        store: questionsGrid,
        dock: 'bottom',
        displayInfo: true,
        beforePageText: 'Страница',
        afterPageText: 'из {0}',
        displayMsg: 'Вопросы {0} - {1} из {2}'
    }],
    columns: [
        {
            xtype: 'rownumberer',
            width: 50
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