package com.snailmann.springboot.exception;

import com.snailmann.springboot.enums.ResultEnum; /**
 * self-defined exception
 */
public class WomanException extends RuntimeException {

    private Integer code ;

    public WomanException(Integer code,String message) {
        super(message);
        this.code = code;
    }

    public WomanException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code=resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}

