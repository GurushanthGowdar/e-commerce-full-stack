package com.example.backend.Authentication;


public class userModel {

    private String pass;

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "userModel{" +
                "pass='" + pass + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public userModel(String pass, String username) {
        this.pass = pass;
        this.username = username;
    }

    public userModel() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;
}
