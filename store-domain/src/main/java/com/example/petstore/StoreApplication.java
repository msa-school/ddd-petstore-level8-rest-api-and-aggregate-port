package com.example.petstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.RestController;


/**
 * http localhost:8080/customers id="jyjang@uengine.org" address:='{"zipcode":"123", "detail":"용인"}'
 */

@SpringBootApplication
@RestController
@EnableAspectJAutoProxy

public class StoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);
	}


}
