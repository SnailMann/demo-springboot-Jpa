package com.snailmann.springboot;

import com.snailmann.springboot.entity.Woman;
import com.snailmann.springboot.service.WomanService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * test class of WomanService class
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class WomanServiceTest {

    @Autowired
    private WomanService womanService;

    @Test
    public void getAgeTest() throws Exception {
            Integer age=womanService.getAge(1);
            Assert.assertEquals(new Integer(13),age);
    }

}
