Ext.define('Constructor.models.QuestionModel', {
    extend: 'Ext.data.Model',
    fields: [
        {
            name: 'id',
            type: 'integer'
        },
        {
            name: 'idTest',
            type: "integer"
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
            name: 'answers'
        }
    ],
    idProperty: 'id',
    proxy: {
        type: 'rest',
        api: {
            create: '/tests/questions',
            read: '/{idTest}/questions',
            update: '/questions',
            destroy: '/questions'
        },
        reader: {
            type: 'json',
            rootProperty: 'questions'
        }
    }
})
