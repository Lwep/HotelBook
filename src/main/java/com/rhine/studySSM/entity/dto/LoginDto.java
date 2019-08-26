package com.rhine.studySSM.entity.dto;

/**
 * @author lwep
 * @dareTime 2019/6/25 9:04
 */
public class LoginDto {
    private Integer id;
    private String username;
    private String password;
    private String realName;
    private String num;


    public LoginDto() {
    }


    public LoginDto(String username, String password) {
        this.username = username;
        this.password = password;
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

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
