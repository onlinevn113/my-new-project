package com.demopdf;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demopdf.test1.Test1;

@SpringBootApplication
public class DemopdfApplication implements CommandLineRunner  {


	public static void main(String[] args) {
		SpringApplication.run(DemopdfApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Test1.test2();
		
	}
}
