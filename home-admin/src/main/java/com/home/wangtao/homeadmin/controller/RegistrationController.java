package com.home.wangtao.homeadmin.controller;

import com.home.wangtao.homeadmin.entity.RegistrationForm;
import com.home.wangtao.homeadmin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegistrationController {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping
    public String registerForm() {
        return "register";
    }

    @PostMapping
    public String processRegisteration(RegistrationForm registrationForm) {
        userService.save(registrationForm.toUser(passwordEncoder));
        return "redirect:/login";
    }
}
