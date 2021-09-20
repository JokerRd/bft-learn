Ext.define('Constructor.controllers.TestController', {
    extend: 'Ext.app.ViewController',
    alias: 'controller.test-controller',
    onSaveTestClick: function () {
        let testStore = Ext.data.StoreManager.lookup('test-store');
        let questionStore = Ext.data.StoreManager.lookup('question-store');
        let primaryForm = this.lookupReference('primary-config');
        let secondaryForm = this.lookupReference('secondary-config');
        let testModel = Ext.create('Constructor.models.SettingsTestModel', {
            nameTest: primaryForm.items.get(0).getValue(),
            descriptionTest: primaryForm.items.get(1).getValue(),
            isShowResult: secondaryForm.items.get(0).getValue()
        });
        testStore.add(testModel);
        console.log(questionStore)
        console.log(testModel)
    },
    onLoadTest: function (obj, records, successful, operation) {
        console.log(obj);
        console.log(records);
        console.log(successful);
        console.log(operation);
    }
})
