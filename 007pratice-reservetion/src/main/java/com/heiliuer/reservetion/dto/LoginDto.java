package com.heiliuer.reservetion.dto;


import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by hao.wang on 2017-5-13.
 */
public class LoginDto {

    @NotEmpty(message = "用户名不能为空")
    String username;

    @NotEmpty(message = "密码不能为空")
    String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
