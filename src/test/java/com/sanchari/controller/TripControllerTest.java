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
public class TripControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testTripController() throws Exception {
        this.mockMvc.perform(get("/trip").param("tripid","1"))


                .andExpect(status().isOk());
    }
}
