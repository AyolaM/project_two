-- Create Schema
CREATE DATABASE `Ayo_Shoe_Store` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
-- Create warehouse table
CREATE TABLE `warehouses` (
  `capacity` int NOT NULL,
  `location_id` int NOT NULL AUTO_INCREMENT,
  `info` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`location_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
-- Create product table
CREATE TABLE `products` (
  `location_id` int DEFAULT NULL,
  `price` double DEFAULT NULL,
  `product_id` int NOT NULL AUTO_INCREMENT,
  `quantity` int DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `shoe_type` enum('HIGH_HEEL','SNEAKER','SANDAL','LOAFER') DEFAULT NULL,
  PRIMARY KEY (`product_id`),
  KEY `FKh233hgjt4m82jg3i8ehl03iv0` (`location_id`),
  CONSTRAINT `FKh233hgjt4m82jg3i8ehl03iv0` FOREIGN KEY (`location_id`) REFERENCES `warehouses` (`location_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

