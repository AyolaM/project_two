package com.skillstorm.project_2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.skillstorm.project_2.models.Products;
import com.skillstorm.project_2.models.ProductType;
import com.skillstorm.project_2.models.Warehouses;

@SpringBootApplication
public class Project2Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Project2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(">>>>>>>>>>>>>>>>>>>");
		
		Products shoe = new Products();
		
		Warehouses warehouse = new Warehouses();
		
		System.out.println(warehouse);
		System.out.println(shoe);
	}


}
