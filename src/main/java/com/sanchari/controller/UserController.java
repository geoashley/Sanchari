package com.sanchari.controller;

import com.sanchari.model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    @GetMapping("/user")
    public String greeting(@RequestParam (name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("usermodel", new UserModel());

        return "create_user";
    }

    @PostMapping("/user")
    public String createUser(@ModelAttribute("usermodel") UserModel usermodel) {
        return "create_user_result";
    }
}
