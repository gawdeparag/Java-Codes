package com.example.springbootdemo;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cpu {
	
//	@Autowired
//	Laptop laptop;
	
	public void compute() {
		System.out.println("Computing...");
//		laptop.iotest();
	}
}


/*
Description:

The dependencies of some of the beans in the application context form a cycle:

┌─────┐
|  cpu (field com.example.springbootdemo.Laptop com.example.springbootdemo.Cpu.laptop)
↑     ↓
|  laptop (field com.example.springbootdemo.Cpu com.example.springbootdemo.Laptop.cpu)
└─────┘


Action:
Relying upon circular references is discouraged and they are prohibited by default. 
Update your application to remove the dependency cycle between beans. 
As a last resort, it may be possible to break the cycle automatically by setting 
"spring.main.allow-circular-references = true".
*/