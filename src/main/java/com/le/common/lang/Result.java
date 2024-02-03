package com.le.common.lang;


import com.baomidou.mybatisplus.extension.api.R;
import org.apache.logging.log4j.message.ReusableMessage;

import java.io.Serializable;

public class Result implements Serializable {
    private int code;
    private String msg;
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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


    public static Result succ(Object data){
        return succ(200,"操作成功", data);
    }

    public static Result succ(int code, String msg, Object data){
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    public static Result fail(String msg){
        return fail(400, msg, null);
    }
    public static Result fail(String msg, Object data){
        return fail(400, msg, data);
    }

    public static Result fail(int code, String msg, Object data){
        Result r = new Result();
        r.setData(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }
}
