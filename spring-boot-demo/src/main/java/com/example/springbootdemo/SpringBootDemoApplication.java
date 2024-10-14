package com.example.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
		
		// Example of IoC pattern implemented using Dependency Injection (DI) design pattern
		Laptop laptop = context.getBean(Laptop.class);
		laptop.run();
		
//		Cpu cpu = context.getBean(Cpu.class);
//		cpu.compute();
	}

}
