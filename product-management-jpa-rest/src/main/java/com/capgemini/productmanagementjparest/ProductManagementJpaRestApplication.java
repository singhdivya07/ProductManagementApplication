package com.capgemini.productmanagementjparest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.capgemini.training")
@EntityScan(basePackages = "com.capgemini.training.entity")
public class ProductManagementJpaRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductManagementJpaRestApplication.class, args);
	}

}
