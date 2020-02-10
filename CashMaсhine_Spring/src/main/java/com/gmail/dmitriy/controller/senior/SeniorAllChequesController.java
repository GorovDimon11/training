package com.gmail.dmitriy.controller.senior;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;

@Controller
@PreAuthorize("hasAuthority('SENIOR_CASHIER')")
public class SeniorAllChequesController {
}
