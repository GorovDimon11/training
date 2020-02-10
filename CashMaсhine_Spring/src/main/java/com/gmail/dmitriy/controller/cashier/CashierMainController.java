package com.gmail.dmitriy.controller.cashier;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Slf4j
@Controller
@RequestMapping("/cashier")
@PreAuthorize("hasAuthority('CASHIER')")
public class CashierMainController {
    private final static String CASHIER_MAIN_PAGE = "cashier/cashierMain";

    @GetMapping
    public String getMainPage(Principal principal, Model model) {

        return CASHIER_MAIN_PAGE;
    }

}
