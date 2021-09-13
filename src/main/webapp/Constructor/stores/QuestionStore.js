Ext.define('Constructor.stores.QuestionStore', {
    extend: 'Ext.data.Store',
    model: 'Constructor.models.QuestionModel',
    proxy: {
        type: 'ajax',
        url: 'questions.json',
        reader: {
            type: 'json',
            rootProperty: 'questions'
        }
    }
});