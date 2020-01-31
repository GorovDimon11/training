package com.gmail.dmitriy.controller;

import com.gmail.dmitriy.entity.User;
import com.gmail.dmitriy.exceptions.UserExistException;
import com.gmail.dmitriy.repository.UserRepository;
import com.gmail.dmitriy.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Slf4j
@Controller
public class RegistrationController {
    @Autowired
    private UserRepository userRepository;

    private final UserService userService;

    @Autowired
    private BCryptPasswordEncoder encoder;

    public RegistrationController(UserService userService) {
        this.userService = userService;
    }
/*
    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }*/

    @GetMapping(value = "/registration")
    public String registration(Model model) {
        model.addAttribute("user", new User());
        return "registration";
    }

    @PostMapping(value = "/registration")
    public String registration(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "registration";
        }
        try {
            userService.saveNewUser(user);
        } catch (UserExistException ex) {
            model.addAttribute("error", true);
            return "registration";
        }
        return "redirect:/login";
    }

}
