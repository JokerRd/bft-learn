Ext.define("Constructor.views.ConfigurationQuestionPanel", {
    extend: 'Ext.grid.Panel',
    alias: 'question-grid',
    title: 'Вопросы',
    width: '70%',
    height: '100%',
    region: 'east',
    columns: [
        { text: 'Name', dataIndex: 'name' },
        { text: 'Email', dataIndex: 'email' },
        { text: 'Phone', dataIndex: 'phone' }
    ]
})