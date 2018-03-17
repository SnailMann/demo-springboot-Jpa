package com.snailmann.springboot.controller;

import com.snailmann.springboot.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@RequestMapping("/hellow")
public class HellowController {

    @Autowired
    private GirlProperties girl = new GirlProperties();

    /**
     * introduce how to use arrays of url
     * it can be visit successful by input /say or /sayhi
     * @return
     */
    @RequestMapping(value = {"/say", "/sayhi"}, method = RequestMethod.GET)
    public String say() {
        return girl.toString();

    }
}
