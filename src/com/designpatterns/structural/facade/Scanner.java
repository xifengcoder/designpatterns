package com.designpatterns.structural.facade;

import java.io.InputStream;

/**
 * Created by xifeng.yang on 2020/2/7
 */
public class Scanner {
    private InputStream inputStream;

    public Scanner(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public Token scan() {
        System.out.println("Scanner::scan()");
        return new Token();
    }
}
