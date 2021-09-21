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
    identifier: 'negative',
    clientIdProperty: 'clientId',
    proxy: {
        type: 'rest',
        actionMethods: {
            create: 'POST',
            read: 'GET',
            update: 'PUT',
            destroy: 'DELETE'
        },
        api: {
            create: '/tests/questions',
            read: '/tests/1/questions',
            update: '/tests/questions',
            destroy: '/tests/questions'
        },
        reader: {
            type: 'json',
            rootProperty: 'questions'
        },
        writer: {
            writeAllFields: true
        }
    }
})
