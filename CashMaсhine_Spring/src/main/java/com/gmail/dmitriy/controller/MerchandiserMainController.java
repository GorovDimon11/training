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
@RequestMapping( "/merchandiser")
@PreAuthorize("hasAuthority('MERCHANDISER')")
public class MerchandiserMainController {
    private final static String MERCHANDISER_MAIN_PAGE = "merchandiserMain";

    @GetMapping
    public String getMainPage(Principal principal, Model model) {

        return MERCHANDISER_MAIN_PAGE;
    }
}
