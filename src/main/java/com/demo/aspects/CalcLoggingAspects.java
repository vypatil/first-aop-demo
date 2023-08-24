package com.demo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.AfterThrowing;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CalcLoggingAspects {
	
	
	@Before("execution(* com.demo.service.Calculator.addition(int,int))")
	public void logBeforeAddition(JoinPoint joinpoint) {
		
		System.out.println("logBefore addition() is running!");
		System.out.println("hijacked: " + joinpoint.getSignature().getName());
		System.out.println("--------------------------------");
		
	}
		
	@AfterReturning("execution(* com.demo.service.Calculator.addition(long,long))")
	public void logAfterReturnning(JoinPoint joinpoint) {
		
		System.out.println("log after addition method is running !! ");
		System.out.println("hijacked: " + joinpoint.getSignature().getName());
		System.out.println("----------------------------------");
		
	}
	
	@AfterReturning("execution (* com.demo.service.Calculator.print() )")
	public void AfterReturningPrint(JoinPoint joinpoint) {
		
		System.out.println(" log After Print method is running");
		System.out.println("hijacked: "+ joinpoint.getSignature().getName());
		System.out.println("------------------------------");
		
	}
	
	@AfterThrowing("execution (* com.demo.service.Calculator.addition(long,int))")
	public void AfterThrowing(JoinPoint joinpoint) {
		
		System.out.println("log after throwing addition() is running!");
		System.out.println("hijacked : " + joinpoint.getSignature().getName());
		System.out.println("--------------------------------");
		
	}
	
	@After("execution (* com.demo.service.Calculator.addition(long,long))")
	public void logAfterAdition(JoinPoint joinpoint) {
		
		System.out.println("log after addition() is running!");
		System.out.println("hijacked: " + joinpoint.getSignature().getName());
		System.out.println("---------------------------");
		
	}
	
	
	
	
	
		
	
	

}
