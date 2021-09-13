Ext.define('Constructor.views.models.AnswerModel', {
    extend: 'Ext.data.Model',
    fields: [
        {
            name: 'id',
            type: 'integer'
        },
        {
            name: 'answer',
            type: 'string'
        },
        {
            name: 'isRight',
            type: 'boolean'
        }
    ],
    idProperty: 'id'
})