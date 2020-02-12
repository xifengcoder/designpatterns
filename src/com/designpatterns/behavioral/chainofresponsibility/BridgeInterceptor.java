package com.designpatterns.behavioral.chainofresponsibility;

import com.designpatterns.behavioral.chainofresponsibility.bean.Request;
import com.designpatterns.behavioral.chainofresponsibility.bean.Response;

import java.io.IOException;

/**
 * Created by Han on 2020/2/12
 */
public class BridgeInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        String key = request.getClientKey();
        String newKey = "BridgeInterceptor -> " + key;
        request.setClientKey(newKey);
        Response response = chain.proceed(request);
        return response;
    }
}
