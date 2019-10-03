package com.sanchari.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TripController {
    @GetMapping("/trip")
    public String tripDetail(@RequestParam(name="tripid", required=true) Long tripid, Model model){

        return "trip_detail";
    }
}
