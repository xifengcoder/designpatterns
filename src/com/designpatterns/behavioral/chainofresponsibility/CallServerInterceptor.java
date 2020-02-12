package com.designpatterns.behavioral.chainofresponsibility;

import com.designpatterns.behavioral.chainofresponsibility.bean.Request;
import com.designpatterns.behavioral.chainofresponsibility.bean.Response;

import java.io.IOException;

/**
 * Created by Han on 2020/2/12
 */
public class CallServerInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        RealInterceptorChain realChain = (RealInterceptorChain) chain;
        Request request = realChain.request();
        String clientKey = request.getClientKey();
        String newKey = "CallServer -> " + clientKey;
        String resString = "CallServer Resp: "+ newKey;
        return new Response(200, resString);
    }
}
