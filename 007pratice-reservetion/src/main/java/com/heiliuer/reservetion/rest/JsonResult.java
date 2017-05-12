package com.heiliuer.reservetion.rest;

/**
 * Created by hao.wang on 2017-5-12.
 */
public class JsonResult {
    int status;
    String msg;
    Object data;

    public JsonResult(int status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public JsonResult(int status) {
        this.status = status;
    }

    public JsonResult(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public JsonResult() {
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
