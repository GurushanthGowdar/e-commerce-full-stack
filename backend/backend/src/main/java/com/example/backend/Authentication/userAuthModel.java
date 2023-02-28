package com.example.backend.Authentication;

public class userAuthModel {

    private String data;

    private Integer expireTime;

    public Integer getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
    }

    public userAuthModel(String data, Integer expireTime, String msg, String token) {
        this.data = data;
        this.expireTime = expireTime;
        this.msg = msg;
        this.token = token;
    }

    public userAuthModel() {
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public userAuthModel(String data, String msg, String token) {
        this.data = data;
        this.msg = msg;
        this.token = token;
    }

    private String msg;


    private String token;


}
