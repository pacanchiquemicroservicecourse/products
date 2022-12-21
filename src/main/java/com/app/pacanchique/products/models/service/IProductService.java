package com.app.pacanchique.products.models.service;

import com.app.pacanchique.products.models.entity.Product;

import java.util.List;

public interface IProductService {
    public List<Product> findAll();
    public Product findById(Long id);
}
