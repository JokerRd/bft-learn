Ext.define('Constructor.controllers.TestController', {
    extend: 'Ext.app.ViewController',
    alias: 'controller.test-controller',
    onSaveTestClick: function () {
        let viewModel = this.getViewModel('test-view-model');
        let testViewModel = viewModel.getData().test;
        let testModel = Ext.create('Constructor.models.SettingsTestModel', testViewModel);
        testModel.save();
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