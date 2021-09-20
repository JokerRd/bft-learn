Ext.define('Constructor.controllers.TestStoreController', {
    extend: 'Ext.app.ViewController',
    alias: 'controller.test-store-controller',
    onLoadTest: function (obj, records, successful, operation) {
        console.log(obj);
        console.log(records);
        console.log(successful);
        console.log(operation);
    }
});