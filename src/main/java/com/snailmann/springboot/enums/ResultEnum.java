package com.snailmann.springboot.enums;

/**
 * Enums of Result.
 * define a set of enuns to maintain the relationship between code and prompt message
 */
public enum ResultEnum {
    UNKONW_ERROR(-1,"unknow error"),
    SUCCESS(0,"success"),
    PRIMARY_SHCOOL(100,"Maybe you still in primary school"),
    HIGN_SCHOOL(100,"Maybe you still in junior high school")
    ;

    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
