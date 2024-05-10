package com.skillstorm.project_2.controllers;

import com.skillstorm.project_2.models.Products;
import com.skillstorm.project_2.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class ProductController {
//constructor injection
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/warehouses")
    public ResponseEntity<List<Products>> getAllWarehouses() {
        List<Products> warehouses = productService.getAllWarehouses();
        return new ResponseEntity<>(warehouses, HttpStatus.OK);
    }

    @GetMapping("/warehouses/{id}")
    public ResponseEntity<Products> getWarehouseById(@PathVariable("id") int id) {
        Products warehouse = productService.getWarehouseById(id);
        return new ResponseEntity<>(warehouse, HttpStatus.OK);
    }

    @GetMapping("/products")
    public ResponseEntity<List<Products>> getAllProducts() {
        List<Products> products = productService.getAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Products> getProductById(@PathVariable("id") int id) {
        Products product = productService.getProductById(id);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @PostMapping("/products")
    public ResponseEntity<Void> createProduct(@RequestBody Products product) {
        productService.createProduct(product);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<Void> updateProduct(@PathVariable("id") int id, @RequestBody Products product) {
        productService.updateProduct(id, product);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable("id") int id) {
        productService.deleteProduct(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
