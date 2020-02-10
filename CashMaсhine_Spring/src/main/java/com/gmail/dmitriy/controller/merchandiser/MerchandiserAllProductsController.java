package com.gmail.dmitriy.controller.merchandiser;

import com.gmail.dmitriy.entity.Product;
import com.gmail.dmitriy.entity.User;
import com.gmail.dmitriy.entity.UserRole;
import com.gmail.dmitriy.exception.ProductNotFoundException;
import com.gmail.dmitriy.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Slf4j
@Controller
@RequestMapping("/merchandiser/all_products")
@PreAuthorize("hasAuthority('MERCHANDISER')")
public class MerchandiserAllProductsController {
    private final ProductService productService;

    public MerchandiserAllProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public String productList(@AuthenticationPrincipal User user, @ModelAttribute("product") Product product,
                              Model model) {
        model.addAttribute("logo_name", user.getName());
        model.addAttribute("logo_nameUkr", user.getNameInUkrainianLanguage());
        try {
            model.addAttribute("all_products", productService.allProducts());
        } catch (NullPointerException e) {
            model.addAttribute("no_products", true);
        }
        return "merchandiser/allProducts";
    }

    @GetMapping("/searchByName")
    public String getProduct(@AuthenticationPrincipal User user, @RequestParam(value="name") String name,
                             @ModelAttribute("product") Product product, Model model) {
        try{
            model.addAttribute("all_products", productService.findByName(name));
        } catch (ProductNotFoundException e){
            log.error("Product " + name + " not found.");
            model.addAttribute("no_product", true);
            return "merchandiser/allProducts";
        }
        model.addAttribute("logo_name", user.getName());
        model.addAttribute("logo_nameUkr", user.getNameInUkrainianLanguage());
        return "merchandiser/allProducts";
    }

}
