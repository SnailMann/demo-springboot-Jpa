package com.snailmann.springboot.utils;

import com.snailmann.springboot.entity.Result;

/**
 * a utils of Result
 */
public class ResultUtils {
    /**
     * if verification is  passed and it has params
     * @param object entity S extends T   e.g.  Woman woman extends T
     * @return
     */
    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(0);//success
        result.setMsg("verification successful");
        result.setData(object);
        return result;
    }

    /**
     * if verification is  passed and without params
     * @return
     */
    public static Result success(){
        return success(null);
    }

    /**
     * if verification is not passed
     * @param code error code
     * @param msg  prompt message
     * @return
     */
    public static Result error(Integer code, String msg) {
        Result result=new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
