package com.snailmann.springboot.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.Assert.*;
/**
 * test Controller layer
 * it must need @RunWith and @SpringBootTest annotation or faild
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class WomanControllerTest {

    @Autowired
    WomanController womanController;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getWomanAge_1() throws Exception {
        womanController.getWomanAge(37);
    }

    @Test
    public void getWomanAge_2() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/woman/get_age/1")).andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.content().string("abc"));
    }
}