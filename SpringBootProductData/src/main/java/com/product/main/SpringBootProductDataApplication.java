package com.product.main;


/**
*This is the SPringBoot Main class
*
* @author Nithya
* @version 1.0
* @since   2019-09-07
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.product.main;"})
public class SpringBootProductDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProductDataApplication.class, args);
	}

}

