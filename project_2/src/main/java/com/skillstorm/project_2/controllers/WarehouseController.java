package com.skillstorm.project_2.controllers;

import com.skillstorm.project_2.models.Warehouses;
import com.skillstorm.project_2.services.WarehouseService;

import java.util.List;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class WarehouseController {

    private final WarehouseService warehouseService;

    public WarehouseController(WarehouseService warehouseService) {
        this.warehouseService = warehouseService;
    }

    @GetMapping("/warehouses")
    public ResponseEntity<List<Warehouses>> getAllWarehouses() {
        List<Warehouses> warehouses = warehouseService.getAllWarehouses();
        return new ResponseEntity<>(warehouses, HttpStatus.OK);
    }

    @GetMapping("/warehouses/{id}")
    public ResponseEntity<Warehouses> getwarehouseById(@PathVariable("id") Integer id) {
        Warehouses warehouse = warehouseService.getWarehouseById(id);
        return new ResponseEntity<>(warehouse, HttpStatus.OK);
    }

    @PostMapping("/warehouses")
    public ResponseEntity<Void> createWarehouse(@RequestBody Warehouses warehouse) {
        warehouseService.createWarehouse(warehouse);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/warehouses/{id}")
    public ResponseEntity<Void> updateWarehouse(@PathVariable("id") Integer id, @RequestBody Warehouses warehouse) {
        warehouseService.updateWarehouse(id, warehouse);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
