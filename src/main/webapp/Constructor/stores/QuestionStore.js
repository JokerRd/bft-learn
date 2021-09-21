Ext.define('Constructor.stores.QuestionStore', {
    extend: 'Ext.data.Store',
    model: 'Constructor.models.QuestionModel',
    storeId: 'question-store',
    pageSize: 10,
    autoLoad: true
});