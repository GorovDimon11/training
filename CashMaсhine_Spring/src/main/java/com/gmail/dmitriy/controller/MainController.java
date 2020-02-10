package com.gmail.dmitriy.controller;

import com.gmail.dmitriy.entity.User;
import com.gmail.dmitriy.entity.UserRole;
import com.gmail.dmitriy.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Slf4j
@Controller
public class MainController {
    private final static String CASHIER_MAIN = "redirect:/cashier";
    private final static String SENIOR_CASHIER_MAIN = "redirect:/senior";
    private final static String MERCHANDISER_MAIN = "redirect:/merchandiser";
    private final static String GUEST_MAIN = "login";
    private UserService userService;

    @Autowired
    public MainController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String getMainPage(Principal principal) {
        UserRole userRole = userService
                .getUserRole(principal.getName());
        switch (userRole) {
            case CASHIER:
                return CASHIER_MAIN;
            case SENIOR_CASHIER:
                return SENIOR_CASHIER_MAIN;
            case MERCHANDISER:
                return MERCHANDISER_MAIN;
        }

        return GUEST_MAIN;
    }

    @GetMapping("/login")
    public String registration() {
        log.info("Clear context");
        SecurityContextHolder.clearContext();

        return GUEST_MAIN;
    }

}
