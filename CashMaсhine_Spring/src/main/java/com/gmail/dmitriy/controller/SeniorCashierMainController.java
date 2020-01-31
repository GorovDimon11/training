package com.gmail.dmitriy.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Slf4j
@Controller
@RequestMapping( "/senior" )
@PreAuthorize( "hasAuthority('SENIOR_CASHIER')" )
public class SeniorCashierMainController {
    private final static String SENIOR_CASHIER_MAIN_PAGE = "seniorMain";

    @GetMapping
    public String getMainPage(Principal principal, Model model) {
        return SENIOR_CASHIER_MAIN_PAGE;
    }
}
