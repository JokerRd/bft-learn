//let testStore = Ext.create('Constructor.stores.TestStore');

Ext.define('Constructor.viewModel.TestViewModel', {
    extend: 'Ext.app.ViewModel',
    alias: 'viewmodel.test-view-model',
    requires: [
        'Constructor.stores.TestStore'
    ],
    stores: {
        tests: {
            type: 'test-store'
        }
    },
    data: {
        test: null
    }
})