package com.designpatterns.behavioral.chainofresponsibility.bean;

/**
 * Created by Han on 2020/2/12
 */
public class Response {
    private int code;
    private String msg;

    public Response(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Response{code: " + this.code + ", msg: " + this.msg + "}";
    }
}
