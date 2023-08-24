package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.config.SpringConfiguration;
import com.demo.service.Calculator;

public class TestCalc {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		Calculator cal = ctx.getBean(Calculator.class);
		
		cal.addition(10l,20l);
//		cal.print();
//		cal.addition(10l,50);
	}

}
