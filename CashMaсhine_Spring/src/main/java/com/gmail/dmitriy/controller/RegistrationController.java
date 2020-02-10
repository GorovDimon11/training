package com.gmail.dmitriy.controller;

import com.gmail.dmitriy.entity.User;
import com.gmail.dmitriy.exception.UserExistException;
import com.gmail.dmitriy.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
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

    private final UserService userService;

    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/registration")
    public String registration(@AuthenticationPrincipal User user, Model model) {
        if (user != null) {
            SecurityContextHolder.clearContext();
        }

        model.addAttribute("user", new User());
        return "registration";
    }

    @PostMapping(value = "/registration")
    public String registration(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "registration";
        }
        try {
            log.info("Added new user " + user.getEmail());
            userService.saveNewUser(user);
        } catch (UserExistException ex) {
            model.addAttribute("error", true);
            return "registration";
        }
        return "redirect:/login";
    }

}
