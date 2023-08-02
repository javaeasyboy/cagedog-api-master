package com.lishiqian.cagedoginterface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.lishiqian")
public class CageDogInterfaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CageDogInterfaceApplication.class, args);
	}

}
