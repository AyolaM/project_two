# Inventory Management API

The inventory management application is to provide an efficient solution for administrators to oversee and manipulate entities within their company's warehouses. It enables tasks such as viewing, adding, removing, and modifying warehouse entities through a web interface. The application addresses potential challenges such as warehouse capacity constraints, ensuring that additions are within permissible limits. Leveraging Java Spring Boot REST API and MySQL Database, the backend system is designed adhere to principles like SOLID and DRY, the codebase ensures maintainability and extensibility. 

## How to use the API

To utilize the API effectively, users can interact with various endpoints tailored for specific functionalities. For example, endpoints like GET /warehouses retrieve information on all warehouses, while GET /products provides a list of all products. Administrators can get detailed data on specific warehouses or products using GET /warehouses/id and GET /products/id respectively. Moreover, they have the flexibility to create, update, or delete product entries using POST, PUT, and DELETE endpoints respectively.

- GET /warehouses – retrieves all warehouses

- GET /warehouses/id – retrieves data on the warehouse

- GET /products – retrieves all products

- GET /products/id – retrieves products by product id

- POST /products – creates a new product entry in the database

- PUT /products/id – updates product entry in the database

- DELETE /products/id – deletes product entry in the database

- DELETE /warehouses/id – deletes warehouse entry in the database 

## Directory
```
└── 📁skillstorm
    └── 📁project_2
        └── Project2Application.java
        └── 📁controllers
            └── ProductController.java
            └── WarehouseController.java
        └── 📁models
            └── ProductType.java
            └── Products.java
            └── SecurityUser.java
            └── User.java
            └── Warehouses.java
        └── 📁repos
            └── ProductRepo.java
            └── UserRepo.java
            └── WarehouseRepo.java
        └── 📁services
            └── CapacityException.java
            └── MyUserDetailsService.java
            └── ProductService.java
            └── SecurityFilter.java
            └── WarehouseService.java
```
