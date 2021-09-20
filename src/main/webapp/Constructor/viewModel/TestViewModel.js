let testStore = Ext.create('Constructor.stores.TestStore');

Ext.define('Constructor.viewModel.TestViewModel', {
    extend: 'Ext.app.ViewModel',
    stores: {
        tests: testStore
    },
    data: {
        test: null
    }
})