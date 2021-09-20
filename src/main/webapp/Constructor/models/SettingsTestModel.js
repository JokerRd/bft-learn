Ext.define('Constructor.models.SettingsTestModel', {
    extend: 'Ext.data.Model',
    fields: [
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
        type: 'ajax',
        api: {
            destroy: 'http://localhost:8080/tests',
            read: 'http://localhost:8080/tests'
        }
    }
})
