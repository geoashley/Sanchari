package com.sanchari.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@WebMvcTest

public class HomeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void test_home_controller() throws  Exception{
        mockMvc.perform(get("/")).andExpect(status().isOk());

    }
}
