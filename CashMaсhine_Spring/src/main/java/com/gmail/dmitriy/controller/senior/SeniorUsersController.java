package com.gmail.dmitriy.controller.senior;

import com.gmail.dmitriy.entity.User;
import com.gmail.dmitriy.entity.UserRole;
import com.gmail.dmitriy.exception.UserNotFoundException;
import com.gmail.dmitriy.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Slf4j
@Controller
@PreAuthorize("hasAuthority('SENIOR_CASHIER')")
public class SeniorUsersController {
    @Autowired
    private UserService userService;

    @GetMapping("/senior/users")
    public String userList(@AuthenticationPrincipal User user,
                           @RequestParam(value = "error_update", required = false) String error_update,
                           Model model) {
        model.addAttribute("error_update", error_update != null);
        model.addAttribute("current_user", user.getEmail());
        model.addAttribute("logo_name", user.getName());
        model.addAttribute("logo_nameUkr", user.getNameInUkrainianLanguage());
        model.addAttribute("users", userService.allUsers());
        model.addAttribute("roles", Arrays.asList(UserRole.values()));
        return "senior/editUsers";
    }

    @PostMapping("/senior/updateUser")
    public String updateUserRole(@RequestParam String email,
                                 @RequestParam String userRoles, Model model) {
        try {
            userService.updateUserRole(email, UserRole.valueOf(userRoles));
        } catch (UserNotFoundException ex) {
            model.addAttribute("error_update", true);
            return "senior/editUsers";
        }
        return "redirect:/senior/users";
    }
}
