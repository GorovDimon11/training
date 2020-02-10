package com.gmail.dmitriy.controller.merchandiser;

import com.gmail.dmitriy.entity.Product;
import com.gmail.dmitriy.entity.User;
import com.gmail.dmitriy.exception.ProductExistException;
import com.gmail.dmitriy.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Slf4j
@Controller
@PreAuthorize("hasAuthority('MERCHANDISER')")
public class MerchandiserAddProductController {
    private final ProductService productService;

    public MerchandiserAddProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/merchandiser/new_product")
    public String productList(@AuthenticationPrincipal User user,
                              @RequestParam(value = "error_add", required = false) String error_add,
                              Model model) {
        model.addAttribute("error_add", error_add != null);
        model.addAttribute("logo_name", user.getName());
        model.addAttribute("logo_nameUkr", user.getNameInUkrainianLanguage());
        model.addAttribute("product", new Product());
        return "merchandiser/addProduct";
    }

    @PostMapping("/merchandiser/saveProduct")
    public String updateUserRole(@Valid @ModelAttribute("product") Product product, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            log.warn("Errors in input: {}", bindingResult.getAllErrors());
            return "merchandiser/addProduct";
        }
        try {
            productService.saveNewProduct(product);
            log.info("Add product with name '" + product.getName() + "'.");
        } catch (ProductExistException ex) {
            model.addAttribute("error_add", true);
            return "merchandiser/addProduct";
        }
        model.addAttribute("well_added", true);
        return "merchandiser/addProduct";
    }
}
