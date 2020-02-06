package com.designpatterns.structural.dynamicproxy;

import com.sun.istack.internal.Nullable;

public interface ICallback {
    @Nullable
    void operate1();

    @Nullable
    void operate2(String str);
}
