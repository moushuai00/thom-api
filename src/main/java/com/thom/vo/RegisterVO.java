package com.thom.vo;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Created by ThinkPad on 2017/4/15.
 */
public class RegisterVO {

    private String name;
    private String email;
    private String account;
    private String password;

    @NotBlank(message="用户名不能为空")
    @Size(min=2 ,max= 18 ,message = "用户名长度必须在2到18位之间")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NotBlank(message="邮箱不能为空")
    @Email(message = "邮箱格式非法")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @NotBlank(message="登录名不能为空")
    @Size(min=3 ,max= 18 ,message = "登录名长度必须在3到18位之间")
    @Pattern(regexp="^[a-zA-Z0-9_]+$", message = "登录名格式非法")
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @NotBlank(message="密码不能为空")
    @Size(min=3 ,max= 18 ,message = "密码长度必须在3到18位之间")
    @Pattern(regexp="^[a-zA-Z0-9_]+$", message = "密码格式非法")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
