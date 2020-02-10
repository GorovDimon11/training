package com.gmail.dmitriy.controller.senior;

import com.gmail.dmitriy.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/senior")
@PreAuthorize("hasAuthority('SENIOR_CASHIER')")
public class SeniorCashierMainController {
    private final static String SENIOR_CASHIER_MAIN_PAGE = "senior/seniorMain";

    @GetMapping
    public String getMainPage(@AuthenticationPrincipal User user, Model model) {
        model.addAttribute("logo_name", user.getName());
        model.addAttribute("logo_nameUkr", user.getNameInUkrainianLanguage());
        return SENIOR_CASHIER_MAIN_PAGE;
    }
}
