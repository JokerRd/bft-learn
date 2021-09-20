Ext.define('Constructor.stores.TestStore', {
    extend: 'Ext.data.Store',
    model: 'Constructor.models.SettingsTestModel',
    alias: 'store.test-store',
    storeId: 'test-store',
    autoLoad: true
});

