package com.app.pacanchique.products.models.dao;

import com.app.pacanchique.products.models.entity.Product;
import org.springframework.data.repository.CrudRepository;
public interface ProductDao extends CrudRepository<Product, Long> {
}
