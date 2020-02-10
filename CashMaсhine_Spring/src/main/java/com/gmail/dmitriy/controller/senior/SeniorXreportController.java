package com.gmail.dmitriy.controller.senior;

import com.gmail.dmitriy.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
@PreAuthorize("hasAuthority('SENIOR_CASHIER')")
public class SeniorXreportController {

    @GetMapping("/senior/x_report")
    public String userList(@AuthenticationPrincipal User user,
                           @RequestParam(value = "error", required = false) String error,
                           Model model) {
        model.addAttribute("logo_name", user.getName());
        model.addAttribute("logo_nameUkr", user.getNameInUkrainianLanguage());
        return "senior/X_report";
    }

}
