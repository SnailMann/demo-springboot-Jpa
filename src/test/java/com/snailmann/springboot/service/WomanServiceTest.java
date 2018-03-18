package com.snailmann.springboot.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * test Service layer
 * it must need @RunWith and @SpringBootTest annotation or faild
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class WomanServiceTest {

    @Autowired
    WomanService womanService;

    @Test
    public void getAge() throws Exception {
        Integer age=womanService.getAge(1);
        Assert.assertEquals(new Integer(13),age);
    }
}