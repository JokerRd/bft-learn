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
    idProperty: 'id'
})