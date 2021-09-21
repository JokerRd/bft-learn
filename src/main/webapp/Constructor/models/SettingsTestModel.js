Ext.define('Constructor.models.SettingsTestModel', {
    extend: 'Constructor.models.BaseModel',
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
        type: 'rest',
        url : '/tests'
    }
})
