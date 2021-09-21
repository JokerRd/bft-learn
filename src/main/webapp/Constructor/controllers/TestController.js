Ext.define('Constructor.controllers.TestController', {
    extend: 'Ext.app.ViewController',
    alias: 'controller.test-controller',
    onSaveTestClick: function () {
        /*let testStore = Ext.data.StoreManager.lookup('test-store');
        let questionStore = Ext.data.StoreManager.lookup('question-store');
        let primaryForm = this.lookupReference('primary-config');
        let secondaryForm = this.lookupReference('secondary-config');
        let testModel = Ext.create('Constructor.models.SettingsTestModel', {
            nameTest: primaryForm.items.get(0).getValue(),
            descriptionTest: primaryForm.items.get(1).getValue(),
            isShowResult: secondaryForm.items.get(0).getValue()
        });*/
        let store = Ext.data.StoreManager.lookup('test-store');
        //let model = Ext.data.schema.Schema.get('default').getEntity('SettingsTestModel');
        //model.save();
        store.update();
    },
    onLoadTest: function (obj, records, successful, operation) {
        if (successful) {
            let viewModel = this.getViewModel('test-view-model');
            let store = Ext.data.StoreManager.lookup('test-store');
            let data = store.getById(1).data;
            viewModel.set('test', data)
        }
    },
    listen: {
        store: {
            "test-store": {
                load: 'onLoadTest'
            }
        }
    }
})

function addHandlerOnLoadTest(controller){
    console.log(controller)
    controller.getStore('test-store').load({
            scope: this,
            callback: function (record, operation, success) {
                console.log(record);
                console.log(operation);
                console.log(success);
                if (success) {
                }
            }
        }
    );
}