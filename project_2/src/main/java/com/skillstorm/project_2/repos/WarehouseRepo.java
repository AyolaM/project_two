package com.skillstorm.project_2.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.skillstorm.project_2.models.Warehouses;

//handles database logic
public interface WarehouseRepo extends JpaRepository<Warehouses, Integer> {

    // https://docs.spring.io/spring-data/jpa/docs/current/api/org/springframework/data/jpa/repository/JpaRepository.html

}
