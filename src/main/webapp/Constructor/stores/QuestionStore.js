Ext.define('Constructor.stores.QuestionStore', {
    extend: 'Ext.data.Store',
    model: 'Constructor.models.QuestionModel',
    storeId: 'question-store',
    autoLoad: true,
    pageSize: 10
});