# Inventory Management API

The inventory management project aims to provide an efficient solution for administrators to oversee and manipulate entities within their company's warehouses. It facilitates tasks such as viewing, adding, removing, and modifying warehouse entities through a user-friendly web interface. The application addresses potential challenges such as warehouse capacity constraints, ensuring that additions are within permissible limits. Leveraging Java Spring Boot REST API and MySQL Database, the backend system is designed to uphold industry standards, offering a robust and scalable solution. By adhering to principles like SOLID and DRY, the codebase ensures maintainability and extensibility. Furthermore, comprehensive documentation accompanies both the code and the API, facilitating ease of understanding and integration for developers.


## How to use the API

To utilize the API effectively, users can interact with various endpoints tailored for specific functionalities. For instance, endpoints like GET /warehouses retrieve information on all warehouses, while GET /products provides a list of all products. Administrators can fetch detailed data on specific warehouses or products using GET /warehouses/id and GET /products/id respectively. Moreover, they have the flexibility to create, update, or delete product entries using POST, PUT, and DELETE endpoints respectively. The API also caters to optional functionalities such as adding new warehouses or implementing user authentication via endpoints like /login and /logout, thus enhancing security measures. Detailed documentation accompanies each endpoint, outlining their purpose, input parameters, and expected outputs, ensuring seamless integration and efficient utilization of the inventory management solution.

- GET /warehouses – retrieves all warehouses

- GET /warehouses/id – retrieves data on the warehouse

- GET /products – retrieves all products

- GET /products/id – retrieves products by product id

- POST /products – creates a new product entry in the database

- PUT /products/id – updates product entry in the database

- DELETE /products/id – deletes product entry in the database

## Directory

- src
    - main
        - java
            - com
                - skillstorm
                    - project_2
                        - controller
                        - model
                        - repository
                        - service
                        - Project2Application.java
    - resources
- pom.xml
- readMe.md