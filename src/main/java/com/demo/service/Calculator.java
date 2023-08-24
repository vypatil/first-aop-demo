package com.demo.service;

import org.springframework.stereotype.Component;

import com.sun.media.sound.AiffFileReader;

@Component
public class Calculator {

	public void print() {
		System.out.println("inside print method");
	}

	
	public void addition(int a, int b) {
		System.out.println("inside addition method (int,int)");
		System.out.println("Addition is : " + (a+b));
	}

	
	public void addition(long a , long b) {
		System.out.println("inside addition method (long,long)");
		System.out.println("Addition is : " + (a+b));
		System.out.println("----------------------------");
		
	}
	
	public void addition(long a , int b) {
		System.out.println("inside addition method (long,int)");
		System.out.println("Addition is : " + (a+b));
		System.out.println("----------------------------");
		throw new ArithmeticException();
	}
	
	
	public Integer sum (int a , int b) throws InterruptedException {
		
		System.out.println("inside sum method");
		
		Thread.sleep(5000);
		
		return a+b;
		
	}
}
