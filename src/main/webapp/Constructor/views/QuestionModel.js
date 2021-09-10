Ext.define('QuestionModel', {
    extend: 'Ext.data.Model',
    fields: [
        {
            name: 'id',
            type: 'integer'
        },
        {
            name: 'nameQuestion',
            type: 'string'
        },
        {
            name: 'descriptionQuestion',
            type: 'string'
        },
        {
            name: 'typeQuestion',
            type: 'string'
        },
        {
            name: 'answers',
            type: 'answer'
        }
    ],
    idProperty: 'id'
})