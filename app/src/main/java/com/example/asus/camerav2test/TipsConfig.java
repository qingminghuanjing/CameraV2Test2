package com.example.asus.camerav2test;

/**
 * Created by 朱凤杰 on 2018/3/9.
 */

public class TipsConfig {
    private String msg;
    private int color;
    private int msgSize;
    private int left;
    private int right;
    private int top;

    public TipsConfig(String msg, int color, int msgSize, int left, int right, int top) {
        this.msg = msg;
        this.color = color;
        this.msgSize = msgSize;
        this.left = left;
        this.right = right;
        this.top = top;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getMsgSize() {
        return msgSize;
    }

    public void setMsgSize(int msgSize) {
        this.msgSize = msgSize;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }
}
