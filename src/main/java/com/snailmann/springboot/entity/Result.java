package com.snailmann.springboot.entity;

/**
 * the return object of http request
 * fuction :format the return results with unified rule (json)
 */
public class Result<T> {

    //error code
    //e.g.  code 0:success  code 1:error
    private Integer code;
    //prompt message
    private String msg;
    //specific data
    private T data;

    //get & set method
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
