package com.app.pacanchique.products.controllers;

import com.app.pacanchique.products.models.entity.Product;
import com.app.pacanchique.products.models.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private IProductService productService;

    @Autowired
    private Environment environment;

    @GetMapping(value = "/list")
    public List<Product> List() {
        return productService.findAll().stream().
                map(product -> {
                    product.setPort(environment.getProperty("local.server.port"));
                    return product;
                }).collect(Collectors.toList());
    }

    @GetMapping(value = "/detail/{id}")
    public Product detail(@PathVariable Long id) {
        Product product = productService.findById(id);
        product.setPort(environment.getProperty("local.server.port"));
        return product;
    }
}
