Ext.define('Constructor.stores.QuestionStore', {
    extend: 'Ext.data.Store',
    model: 'Constructor.models.QuestionModel',
    alias: 'store.question-store',
    storeId: 'question-store',
    pageSize: 10,
    autoLoad: true
});