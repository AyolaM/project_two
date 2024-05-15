package com.skillstorm.project_2.services;

import com.skillstorm.project_2.models.Warehouses;
import com.skillstorm.project_2.repos.WarehouseRepo;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class WarehouseService {

    private final WarehouseRepo warehouseRepo;

    public WarehouseService(WarehouseRepo warehouseRepo) {
        this.warehouseRepo = warehouseRepo;
    }

    public List<Warehouses> getAllWarehouses() {
        return warehouseRepo.findAll();
    }

    public Warehouses getWarehouseById(Integer id) {
        return warehouseRepo.findById(id).orElse(null);
    }

    public void createWarehouse(Warehouses warehouse) {

        warehouseRepo.save(warehouse);
    }

    public void updateWarehouse(Integer id, Warehouses warehouse) {
        Warehouses existingWarehouse = warehouseRepo.findById(id).orElse(null);
        if (existingWarehouse != null) {
            // Update existing warehouse
            existingWarehouse.setCapacity(warehouse.getCapacity());
            existingWarehouse.setInfo(warehouse.getInfo());
            // Update other fields
            warehouseRepo.save(existingWarehouse);
        }
    }

}
