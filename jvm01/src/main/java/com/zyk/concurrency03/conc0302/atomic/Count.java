
package com.zyk.concurrency03.conc0302.atomic;

public class Count {

    private int num = 0;

    public int add() {
        return num++;
    }

    public int getNum() {
        return num;
    }
}
