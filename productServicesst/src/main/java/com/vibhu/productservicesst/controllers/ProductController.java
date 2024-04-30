package com.vibhu.productservicesst.controllers;

import com.vibhu.productservicesst.dtos.ExceptionDto;
import com.vibhu.productservicesst.models.Product;
import com.vibhu.productservicesst.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;
    ProductController(@Qualifier("selfProductService") ProductService productService){
        this.productService = productService;
    }

//    ProductController(@Qualifier("fakeStoreProductService") ProductService productService){
//        this.productService = productService;
//    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id){
        return productService.getProductById(id);
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    @PostMapping
    public Product createProduct(@RequestBody Product product ){
        return productService.createProduct(product);
    }
}
