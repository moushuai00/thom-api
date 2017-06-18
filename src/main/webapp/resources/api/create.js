jQuery(document).ready(function ($) {

    jQuery('#tree').jqGrid({
        autowidth: true,
        shrinkToFit: true,
        "hoverrows": false,
        "viewrecords": false,
        "gridview": true,
        "url": "get-default-api-data",
        "editurl": "clientArray",
        "ExpandColumn": "name",
        "height": "auto",
        "sortname": "account_id",
        "scrollrows": true,
        "treeGrid": true,
        "pager": "#pager",
        "treedatatype": "json",
        "treeGridModel": "adjacency",
        "loadonce": true,
        "rowNum": 1000,
        "treeReader": {
            "id_field": "account_id",
            "parent_id_field": "parent_id",
            "level_field": "level",
            "leaf_field": "isLeaf",
            "expanded_field": "expanded",
            "loaded": "loaded",
            "icon_field": "icon"
        },
        "datatype": "json",
        "colModel": [
            {
                "name": "account_id",
                "key": true,
                "hidden": true
            }, {
                "name": "name",
                "label": "名称",
                "width": 170,
                "editable": true
            }, {
                "name": "desc",
                "label": "描述",
                "width": 170,
                "editable": true
            }, {
                "name": "type",
                "label": "类型",
                "width": 90,
                "editable": true,
                "edittype": "select",
                "editoptions": {value: "string:string;object:object;number:number;boolean:boolean"},
                "editrules": {
                    custom: true, custom_func: function (value, colname) {
                        var selId = $("#tree").jqGrid("getGridParam", "selrow");

                        var ctd = $("#" + selId + ">td")[8];

                        if (value != "object") {
                            var children = $("#tree").jqGrid("getNodeChildren", $("#tree").jqGrid("getLocalRow", selId));

                            if (children != undefined && children.length > 0) {
                                return [false, "该节点已有子节点，不能设置成非object类型，如需设置请删除子节点"];
                            }

                            $(ctd).find("a").hide();
                        } else {
                            $(ctd).find("a").show();
                        }

                        return [true];
                    }
                }
            }, {
                "name": "credit",
                "label": "模型名称",
                "width": 90,
                "align": "right",
                "editable": true
            }, {
                "name": "balance",
                "label": "MOCK规则",
                "width": 90,
                "align": "right",
                "editable": true
            }, {
                "name": "parent_id",
                "hidden": true
            },
            {
                name: '编辑', width: 60, fixed: true, sortable: false, resize: false, formatter: 'actions',
                formatoptions: {keys: true}
            },
            {
                name: '新增', index: 'operMod', align: "center", width: "40",
                formatter: function (value, grid, rows, state) {
                    if (rows.type == "object") {
                        return "<a href='#' onclick='addRow(\"" + rows.account_id + "\"," + rows.level + ")'><span class=\"ui-icon ui-icon-plus\"></span></a>"
                    } else {
                        return "<a href='#' style='display: none' onclick='addRow(\"" + rows.account_id + "\"," + rows.level + ")'><span class=\"ui-icon ui-icon-plus\"></span></a>"
                    }
                }
            }
        ],
        caption: "请求参数"
    });
    jQuery("#tree").jqGrid('navGrid', "#pager",
        {edit: false, add: false, addtext: "添加 ", del: false, deltext: "删除", refresh: false});


    jQuery("#tree").navButtonAdd("#pager", {
        caption: "新增",
        title: "add",
        buttonicon: "ui-icon-plus",
        onClickButton: function () {
            addRow(null, -1);
        },
        position: "first"
    });

    jQuery('#tree').jqGrid('bindKeys');
})
;


function addRow(account_id, level) {
    var id = $.jgrid.randId();

    var item = '{"account_id":\"' + id + '\", "name": "Cash","acc_num": "100","type": "string","credit": "250.00","balance": "150.00","parent_id":\"' + account_id + '\", "level":\"' + (level + 1) + '\", "isLeaf": "true", "loaded": "true", "expanded": "true"}';
    $("#tree").jqGrid("addChildNode", id, account_id, JSON.parse(item));
}