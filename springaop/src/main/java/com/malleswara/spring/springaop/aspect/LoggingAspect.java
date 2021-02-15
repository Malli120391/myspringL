package com.malleswara.spring.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	
	@Before("execution(* com.malleswara.spring.springaop.ProductServiceImple.multiply(..))")
  public void logBefore(JoinPoint joinPoint)	{
	  
	  System.out.println("BEfore Calling the Method");
  }
	
	@After("execution(* com.malleswara.spring.springaop.ProductServiceImple.multiply(..))")
	public void logAfter(JoinPoint joinPoint) {
		
		System.out.println("After the method execution");
	}

}
