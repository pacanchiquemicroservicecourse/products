package com.app.pacanchique.products.controllers;

import com.app.pacanchique.products.models.entity.Product;
import com.app.pacanchique.products.models.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping(value = "/list")
    public List<Product> List() {
        return productService.findAll();
    }

    @GetMapping(value = "/detail/{id}")
    public Product detail(@PathVariable Long id) {
        return productService.findById(id);
    }
}
