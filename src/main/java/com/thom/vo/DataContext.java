package com.thom.vo;

/**
 * Created by ThinkPad on 2017/4/15.
 */
public class DataContext<T> {
    private String code;
    private String message;
    private T data;

    public DataContext(){

    }

    public DataContext(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public DataContext(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
