let state = Ext.create('Ext.data.Store', {
    fields: ['typeQuestion'],
    data: [
        {'typeQuestion':'С вводимым ответом'},
        {'typeQuestion':'C выбором ответа'}
    ]
})


Ext.define('Constructor.views.configurationQuestions.TypeQuestionComboBox', {
    extend: 'Ext.form.ComboBox',
    alias: 'widget.type-question',
    fieldLabel: 'Тип вопроса',
    name: 'typeQuestion',
    store: state,
    forceSelection: true,
    displayField: 'typeQuestion',
    valueField: 'typeQuestion',
    queryMode: 'local',
    value: 'С вводимым ответом'
})