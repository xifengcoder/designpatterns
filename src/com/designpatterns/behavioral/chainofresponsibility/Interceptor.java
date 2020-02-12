package com.designpatterns.behavioral.chainofresponsibility;

import com.designpatterns.behavioral.chainofresponsibility.bean.Request;
import com.designpatterns.behavioral.chainofresponsibility.bean.Response;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Han on 2020/2/12
 */
public interface Interceptor {
    Response intercept(Chain chain) throws IOException;

    interface Chain {
        Request request();

        Response proceed(Request request) throws IOException;
    }
}
