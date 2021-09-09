Ext.define('Constructor.Application', {
    extend: 'Ext.app.Application',
    mainView: 'Constructor.views.Main',
    launch: function () {
        Ext.create({
            xtype: 'main'
        });
    }
});