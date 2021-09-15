Ext.define('Constructor.stores.TestStore', {
    extend: 'Ext.data.Store',
    model: 'Constructor.models.SettingsTestModel',
    storeId: 'test-store',
    autoLoad: true
});