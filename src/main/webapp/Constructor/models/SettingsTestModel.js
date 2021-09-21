Ext.define('Constructor.models.SettingsTestModel', {
    extend: 'Constructor.models.BaseModel',
    fields: [
        {
            name: 'id',
            type: 'integer'
        },
        {
            name: 'nameTest',
            type: 'string'
        },
        {
            name: 'descriptionTest',
            type: 'string'
        },
        {
            name: 'isShowResult',
            type: 'boolean'
        }
    ],
    idProperty: 'id',
    proxy: {
        type: 'rest',
        url : '/tests',
        reader: {
            type: 'json',
            rootProperty: 'test'
        },
        writer: {
            writeAllFields: true
        }
    }
})
