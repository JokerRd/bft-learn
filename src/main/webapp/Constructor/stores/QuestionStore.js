Ext.define('Constructor.stores.QuestionStore', {
    extend: 'Ext.data.Store',
    model: 'Constructor.models.QuestionModel',
    autoLoad: true,
    proxy: {
        type: 'ajax',
        url: 'Constructor/stores/questions.json',
        reader: {
            type: 'json',
            rootProperty: 'questions'
        }
    }
});