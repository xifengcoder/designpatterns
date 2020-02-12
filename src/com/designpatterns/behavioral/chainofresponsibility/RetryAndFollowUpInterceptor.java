package com.designpatterns.behavioral.chainofresponsibility;

import com.designpatterns.behavioral.chainofresponsibility.bean.Request;
import com.designpatterns.behavioral.chainofresponsibility.bean.Response;

import java.io.IOException;

/**
 * Created by Han on 2020/2/12
 */
public class RetryAndFollowUpInterceptor implements Interceptor {

    private static final int TRY_TIMES = 1;

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        RealInterceptorChain realChain = (RealInterceptorChain) chain;
        String key = request.getClientKey();
        String newKey = "RetryAndFollowUpInterceptor -> " + key;
        request.setClientKey(newKey);
        Response response = null;
        int times = TRY_TIMES;
        while (times > 0) {
            response = realChain.proceed(request);
            times--;
        }

        return response;
    }
}
