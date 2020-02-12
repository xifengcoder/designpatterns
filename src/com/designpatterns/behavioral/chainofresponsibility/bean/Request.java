package com.designpatterns.behavioral.chainofresponsibility.bean;

/**
 * Created by Han on 2020/2/12
 */
public class Request {
    private String clientKey;

    public Request(String key) {
        this.clientKey = key;
    }

    public String getClientKey() {
        return clientKey;
    }

    public void setClientKey(String key) {
        clientKey = key;
    }
}
