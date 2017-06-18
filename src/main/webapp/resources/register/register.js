$(function () {
    $('.form-register').bootstrapValidator({
        message: '输入非法',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            name: {
                message: '用户名验证失败',
                validators: {
                    notEmpty: {
                        message: '用户名不能为空'
                    },
                    stringLength: {
                        min: 2,
                        max: 18,
                        message: '用户名长度必须在2到18位之间'
                    }
                }
            },
            email: {
                validators: {
                    notEmpty: {
                        message: '邮箱地址不能为空'
                    },
                    emailAddress: {
                        message: '邮箱地址格式有误'
                    }
                }
            },
            account: {
                validators: {
                    notEmpty: {
                        message: '登录名不能为空'
                    },
                    stringLength: {
                        min: 3,
                        max: 18,
                        message: '登录名长度必须在3到18位之间'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9_]+$/,
                        message: '登录名只能包含大写、小写、数字和下划线'
                    }
                }
            },
            password: {
                validators: {
                    notEmpty: {
                        message: '密码不能为空'
                    },
                    stringLength: {
                        min: 6,
                        max: 18,
                        message: '密码长度必须在6到18位之间'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9_]+$/,
                        message: '登录名只能包含大写、小写、数字和下划线'
                    }
                }
            },
            re_password: {
                validators: {
                    notEmpty: {
                        message: '确认密码不能为空'
                    },
                    stringLength: {
                        min: 6,
                        max: 18,
                        message: '密码长度必须在6到18位之间'
                    },
                    identical: {
                        field: 'password',
                        message: '两次输入密码不一致'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9_]+$/,
                        message: '登录名只能包含大写、小写、数字和下划线'
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

        // Use Ajax to submit form data 提交至form标签中的action，result自定义
        $.post($form.attr('action'), $form.serialize(), function (result) {
            if (result != undefined && result.code == "0000") {
                swal({
                        title: "提示",
                        text: "恭喜注册成功",
                        type: "success",
                        showCancelButton: true,
                        confirmButtonColor: "#DD6B55",
                        cancelButtonText: "关闭",
                        confirmButtonText: "去登录",
                        closeOnConfirm: false
                    },
                    function () {
                        $(location).prop('href', 'login')
                    });
            } else if (result != undefined && result.code != "0000") {
                swal("异常", result.message, "error");
            } else {
                swal("异常", "服务异常", "error");
            }
        });
    });
});
