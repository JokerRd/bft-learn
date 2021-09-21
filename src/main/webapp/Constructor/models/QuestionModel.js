Ext.define('Constructor.models.QuestionModel', {
    extend: 'Ext.data.Model',
    fields: [
        {
            name: 'id'
        },
        {
            name: 'idClient',
            type: "integer"
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
    idProperty: 'idClient',
    proxy: {
        type: 'rest',
        paramsAsJson: true,
        appendId: false,
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
