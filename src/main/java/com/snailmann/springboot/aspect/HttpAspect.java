package com.snailmann.springboot.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * learn to using AOP characteristic
 * achieve log function by AOP way
 * @Aspect is a way of aop annotation
 */
@Aspect
@Component
public class HttpAspect {

    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    /**
     * define pointcut of aop
     * it will execute our method when any function that belongs to com.snailmann.springboot.controller.WomanController is called
     * (..) mean that pass any params
     */
    @Pointcut("execution(public * com.snailmann.springboot.controller.WomanController.*(..))")
    public void log() {
    }

    ;

    @Before("log()")
    public void doBefore(JoinPoint joinPoint) {
        logger.info("正在获得执行方法的信息...");
        //get HttpServletRequest
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //get url
        logger.info("url={}", request.getRequestURI());
        //get method of request(e.g. GET or POST)
        logger.info("method={}", request.getMethod());
        //get ip
        logger.info("ip={}", request.getRemoteAddr());
        //get class method(get class name and get method name)
        logger.info("class_method={}", joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        //get params
        logger.info("params={}", joinPoint.getArgs());
    }

    @After("log()")
    public void doAfter() {
        logger.info("执行方法分析完毕...");
    }

    /**
     * get result of http response
     * @param object
     */
    @AfterReturning(returning = "object", pointcut = "log()")
    public void doAfterReturning(Object object){
        logger.info("response={}",object.toString());
    }
}
