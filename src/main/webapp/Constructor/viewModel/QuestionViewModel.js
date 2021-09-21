Ext.define('Constructor.viewModel.QuestionViewModel', {
    extend: 'Ext.app.ViewModel',
    alias: 'viewmodel.question-view-model',
    requires: [
        'Constructor.stores.QuestionStore'
    ],
    stores: {
        questions: {
            type: 'question-store'
        }
    },
    data: {
        questions: null
    }
})