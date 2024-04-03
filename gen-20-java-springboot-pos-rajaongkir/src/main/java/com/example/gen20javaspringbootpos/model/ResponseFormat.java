package com.example.gen20javaspringbootpos.model;

public class ResponseFormat {
    int status;
    String msg;

    public ResponseFormat(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ResponseInsert{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                '}';
    }
}
