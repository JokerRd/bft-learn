const createPanel = () => {
    return Ext.create('Ext.tab.Panel', {
        title: 'Child Panel 1',
        height: 100,
        width: '75%'
    });
}

Ext.define('Constructor.views.Main', {
    extend: 'Ext.tab.Panel',
    width: 400,
    height: 300,
    title: 'Container Panel',
    items: [
        createPanel(),
        createPanel(),
        Ext.create('Ext.Button', {
            text: 'Button'
        })
    ]
});