package com.practice.todo_app.helloWorld;


public class HelloWorldBean {

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

    public HelloWorldBean(String message){
        this.msg = message;
    }

}
