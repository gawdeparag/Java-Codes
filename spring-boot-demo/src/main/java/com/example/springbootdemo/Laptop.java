package com.example.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
	@Autowired
	Cpu cpu;
	
	public void run() {
		cpu.compute();
		System.out.println("Laptop is running!");
	}
	
//	public void iotest() {
//		System.out.println("IO Testing...");
//	}
}
