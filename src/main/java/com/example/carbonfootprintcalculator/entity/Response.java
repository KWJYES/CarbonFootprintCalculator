package com.example.carbonfootprintcalculator.entity;

import java.util.Objects;

public class Response {
    private Integer code;
    private  String msg;
    private String token;

    public  Response(Integer code,String msg,String token){
        this.code = code;
        this.msg = msg;
        this.token = token;
    }


    @Override
    public String toString() {
        return "Response{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", token='" + token + '\'' +
                '}';
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public String getToken() {
        return token;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Response)) return false;
        Response response = (Response) o;
        return Objects.equals(code, response.code) && Objects.equals(msg, response.msg) && Objects.equals(token, response.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, msg, token);
    }



}
