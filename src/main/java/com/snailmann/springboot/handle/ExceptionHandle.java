package com.snailmann.springboot.handle;

import com.snailmann.springboot.entity.Result;
import com.snailmann.springboot.exception.WomanException;
import com.snailmann.springboot.utils.ResultUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ControllerAdvice handle exception by AOP way
 * intercepting the exception and unify processing
 */
@ControllerAdvice
public class ExceptionHandle {


    private static final Logger logger=LoggerFactory.getLogger(ExceptionHandle.class);
    /**
     * @ExceptionHandler(value=Exception.class)  declare what exception class will be handled
     * all exception belong to Exception class will be handle by this way and return the result of a unified format
     * @param e
     * @return
     */
    @ExceptionHandler(value = {Exception.class})
    @ResponseBody
    public Result resultHandle(Exception e) {

        if (e instanceof WomanException){
            WomanException womanException=(WomanException) e;
            return ResultUtils.error(womanException.getCode(), womanException.getMessage());
        }else{
            //output the information of Exception class
            logger.error("System Error:{}",e);
            return ResultUtils.error(999,"unknown error");
        }




    }
}
