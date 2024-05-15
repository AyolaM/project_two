package com.skillstorm.project_2.controllers;

import com.skillstorm.project_2.models.Products;
import com.skillstorm.project_2.services.CapacityException;
import com.skillstorm.project_2.services.ProductService;

import java.util.List;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")  //gets all products (list)
    public ResponseEntity<List<Products>> getAllProducts() {  //ResponseEntity allows you to control http responses
        List<Products> products = productService.getAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Products> getProductById(@PathVariable("id") Integer id) {
        Products product = productService.getProductById(id);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @PostMapping("/products")
    public ResponseEntity<Void> createProduct(@RequestBody Products product) throws CapacityException {
        productService.createProduct(product);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<Void> updateProduct(@PathVariable("id") Integer id, @RequestBody Products product) {
        productService.updateProduct(id, product);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable("id") Integer id) {
        productService.deleteProduct(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}