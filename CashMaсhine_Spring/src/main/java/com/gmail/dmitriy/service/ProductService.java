package com.gmail.dmitriy.service;

import com.gmail.dmitriy.entity.Product;
import com.gmail.dmitriy.exception.ProductExistException;
import com.gmail.dmitriy.exception.ProductNotFoundException;
import com.gmail.dmitriy.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> allProducts() {
        return productRepository.findAll();
    }

    public void saveNewProduct(Product product) throws ProductExistException {
        try {
            productRepository.save(product);
            log.debug("Added new product " + product.getName());
        } catch (Exception ex) {
            throw new ProductExistException();
        }
    }

    public Optional<Product> findByName(String name) throws ProductNotFoundException{
        try{
            return productRepository.findByName(name);
        } catch (Exception ex) {
            throw new ProductNotFoundException();
        }
    }

    public Optional<Product> findByNameUkr(String name) throws ProductNotFoundException{
        try{
            return productRepository.findByNameUkr(name);
        } catch (Exception ex) {
            throw new ProductNotFoundException();
        }
    }

}
