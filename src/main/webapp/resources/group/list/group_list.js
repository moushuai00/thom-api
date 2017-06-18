$(function () {
    var $table = $('#table');
    $table.bootstrapTable({
        url: "group-list",
        dataType: "json",
        pagination: true, //分页
        singleSelect: false,
        search: true, //显示搜索框
        sidePagination: "server", //服务端处理分页
        columns: [
            {
                title: '编号',
                field: 'id',
                align: 'center',
                valign: 'middle',
                visible: false
            },
            {
                title: '组名',
                field: 'name',
                align: 'center',
                valign: 'middle',
            },
            {
                title: '组描述',
                field: 'description',
                align: 'center'
            },
            {
                title: '创建人',
                field: '',
                align: 'center'
            },
            {
                title: '团队人数',
                field: '',
                align: 'center'
            },
            {
                title: '状态',
                field: 'open',
                align: 'center',
                formatter: function (value, row, index) {
                    if (value == false) {
                        return "私有";
                    } else {
                        return "公开";
                    }
                }
            },
            {
                title: '操作',
                field: 'id',
                align: 'center',
                formatter: function (value, row, index) {
                    var e = '<a href="#" mce_href="#" onclick="edit(\'' + row.id + '\')">编辑</a> ';
                    var d = '<a href="#" mce_href="#" onclick="del(\'' + row.id + '\')">删除</a> ';
                    return e + d;
                }
            }
        ]
    })
});