$(function () {
    $('.group-add-form').bootstrapValidator({
        message: '输入非法',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            name: {
                message: '团队名验证失败',
                validators: {
                    notEmpty: {
                        message: '团队名不能为空'
                    }
                }
            },
            description: {
                validators: {
                    notEmpty: {
                        message: '团队描述不能为空'
                    }
                }
            }
        }
    }).on('success.form.bv', function (e) {//点击提交之后
        // Prevent form submission
        e.preventDefault();

        // Get the form instance
        var $form = $(e.target);

        // Get the BootstrapValidator instance
        $form.data('bootstrapValidator');

        var data = $form.serialize();
        // Use Ajax to submit form data 提交至form标签中的action，result自定义
        $.post($form.attr('action'), data, function (result) {
            if (result != undefined && result.code == "0000") {
                swal({
                        title: "提示",
                        text: "创建成功",
                        type: "success",
                        confirmButtonColor: "#DD6B55",
                        confirmButtonText: "确认",
                    })
            } else if (result != undefined && result.code != "0000") {
                swal("异常", result.message, "error");
            } else {
                swal("异常", "服务异常", "error");
            }

            $(".group-add-form :submit").removeAttr("disabled")
        });
    });
});
