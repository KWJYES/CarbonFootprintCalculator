package com.example.carbonfootprintcalculator.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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


    @AllArgsConstructor
    @NoArgsConstructor
    public static class User {
        private Integer uid;
        private String uname;
        private String pwd;

        public void setUid(Integer uid) {
            this.uid = uid;
        }

        public void setUname(String uname) {
            this.uname = uname;
        }

        public void setPwd(String pwd) {
            this.pwd = pwd;
        }

        public String getUname() {
            return uname;
        }

        public String getPwd() {
            return pwd;
        }

        public Integer getUid() {
            return uid;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof User)) return false;
            User user = (User) o;
            return Objects.equals(uid, user.uid) && Objects.equals(uname, user.uname) && Objects.equals(pwd, user.pwd);
        }

        @Override
        public int hashCode() {
            return Objects.hash(uid, uname, pwd);
        }

        @Override
        public String toString() {
            return "User{" +
                    "uid=" + uid +
                    ", uname='" + uname + '\'' +
                    ", pwd='" + pwd + '\'' +
                    '}';
        }
    }
}
