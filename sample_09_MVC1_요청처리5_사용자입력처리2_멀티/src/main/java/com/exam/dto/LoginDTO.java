package com.exam.dto;

import java.util.List;

public class LoginDTO {

    String userid;
    String password;

    //String [] email;
    List<String> email;

    public LoginDTO() {}

    public LoginDTO(String userid, String password) {
        this.userid = userid;
        this.password = password;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getEmail() {
        return email;
    }

    public void setEmail(List<String> email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "LoginDTO{" +
                "userid='" + userid + '\'' +
                ", password='" + password + '\'' +
                ", email=" + email +
                '}';
    }
}
