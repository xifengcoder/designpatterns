package com.designpatterns.behavioral.chainofresponsibility;

import com.designpatterns.behavioral.chainofresponsibility.bean.Request;
import com.designpatterns.behavioral.chainofresponsibility.bean.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Han on 2020/2/12
 */
public class Client {
    public static void main(String[] args) throws IOException {
        List<Interceptor> interceptors = new ArrayList<>();
        interceptors.add(new RetryAndFollowUpInterceptor());
        interceptors.add(new BridgeInterceptor());
        interceptors.add(new CallServerInterceptor());

        Interceptor.Chain chain = new RealInterceptorChain(interceptors, null, 0);
        Request request = new Request("client");
        Response response = chain.proceed(request);
        System.out.println("request: " + request);
        System.out.println("response: " + response);
    }
}
