package com.practice.todo_app.basic.auth;


public class AuthenticationBean {

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "HelloWorldBean [msg=" + msg + "]";
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private String msg;

    public AuthenticationBean(String message){
        this.msg = message;
    }

}
