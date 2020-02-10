package com.gmail.dmitriy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class CashMachine {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(CashMachine.class, args);
    }

    @RequestMapping("/shit")
    public String showHello() {
        return "shit.html";
    }
}
