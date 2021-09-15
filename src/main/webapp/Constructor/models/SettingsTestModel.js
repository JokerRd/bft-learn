Ext.define('Constructor.models.SettingsTestModel', {
    extend: 'Ext.data.Model',
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
        },
        {
            name: 'questions'
        }
    ],
    idProperty: 'id'
})
