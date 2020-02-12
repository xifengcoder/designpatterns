package com.designpatterns.behavioral.chainofresponsibility;

import com.designpatterns.behavioral.chainofresponsibility.bean.Request;
import com.designpatterns.behavioral.chainofresponsibility.bean.Response;

import java.io.IOException;
import java.util.List;

/**
 * Created by Han on 2020/2/12
 */
public class RealInterceptorChain implements Interceptor.Chain {

    private final List<Interceptor> interceptors;
    private final int index;
    private final Request request;

    private int calls;

    public RealInterceptorChain(List<Interceptor> interceptors, Request request, int index) {
        this.interceptors = interceptors;
        this.index = index;
        this.request = request;
    }

    @Override
    public Request request() {
        return request;
    }

    @Override
    public Response proceed(Request request) throws IOException {
        if (index >= interceptors.size()) throw new AssertionError();
        calls++;

        if (calls > 1) {
            throw new IllegalStateException("interceptor " + interceptors.get(index - 1)
                    + " must call proceed() exactly once");
        }

        // Call the next interceptor in the chain.
        RealInterceptorChain next = new RealInterceptorChain(interceptors, request, index + 1);
        Interceptor interceptor = interceptors.get(index);
        Response response = interceptor.intercept(next);

        if (index + 1 < interceptors.size() && next.calls != 1) {
            throw new IllegalStateException("interceptor " + interceptor
                    + " must call proceed() exactly once");
        }

        // Confirm that the intercepted response isn't null.
        if (response == null) {
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }

        return response;
    }
}
