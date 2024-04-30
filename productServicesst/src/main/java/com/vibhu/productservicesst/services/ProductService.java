package com.vibhu.productservicesst.services;

import com.vibhu.productservicesst.models.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long id);  // interface methods are by default public and static
    List<Product> getAllProducts();
    Product createProduct( Product product );
}
