package com.rhine.studySSM.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class User implements Serializable {

    // 用户主键
    private Integer id;
    // 用户名
    private String username;
    // 用户登录密码
    private String password;
    // 用户邮箱
    private String email;
    // 用户电话号码
    private String phone;
    // 用户真实姓名
    private String realName;

    //用户状态 默认 1 可用，0 不可用
    private Integer status;

    public User() {
    }

    public User(Integer id, String username, String password, String email, String phone, String realName, String gender, String photoPath) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.realName = realName;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", realName='" + realName + '\'' +
                ", status=" + status +
                '}';
    }
}
