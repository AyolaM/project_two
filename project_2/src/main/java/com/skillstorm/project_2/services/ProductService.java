package com.skillstorm.project_2.services;

import com.skillstorm.project_2.models.Products;
import com.skillstorm.project_2.models.Warehouses;
import com.skillstorm.project_2.repos.ProductRepo;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public List<Products> getAllProducts() {
        return productRepo.findAll();
    }

    public Products getProductById(Integer id) {
        return productRepo.findById(id).orElse(null);
    }

    // public void createProduct(Products product) {
    // productRepo.save(product);
    // }

    public void createProduct(Products product) throws CapacityException {
        Warehouses warehouse = product.getLocationId();
        int currentCapacity = warehouse.getCapacity();
        int newProductQuantity = product.getQuantity();

        if (currentCapacity + newProductQuantity <= warehouse.getCapacity()) {
            productRepo.save(product);
        } else {

            throw new CapacityException(
                    "Warehouse " + warehouse.getLocationId() + "is at capacity, try another one.");
        }
    }

    public void updateProduct(Integer id, Products product) {
        Products existingProduct = productRepo.findById(id).orElse(null);
        if (existingProduct != null) {
            // Update existing product
            existingProduct.setDescription(product.getDescription());
            existingProduct.setPrice(product.getPrice());
            existingProduct.setQuantity(product.getQuantity());
            existingProduct.setShoeType(product.getShoeType());
            existingProduct.setLocationId(product.getLocationId());
            productRepo.save(existingProduct);
        }
    }

    public void deleteProduct(Integer id) {
        productRepo.deleteById(id);
    }
}
