package com.example.demo.controller;


import com.example.demo.domain.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductController {

    @PostMapping("/v1/product")
    public ResponseEntity<Product> createProduct(
            @RequestBody CreateProductDto newProduct
    ){
        Product product = new Product();
        product.setId(1L);
        product.setName(newProduct.getName());

        return ResponseEntity.created(product);
    }
}
