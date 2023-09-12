package com.desmond.sprintaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class LoggingAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

	@AfterReturning(value = "execution(* com.desmond.sprintaop.business.*.*(..))",
			        returning = "result")
	//@AfterReturning("execution(* com.desmond.sprintaop.data.*.*(..))")
	public void logAfterExecution(JoinPoint joinPoint, Object result) {
		//logger.info("Method {} complete", joinPoint);
		logger.info("{} returned with: {}", joinPoint, result);		
	}
	
	@AfterThrowing(value = "execution(* com.desmond.sprintaop.business.*.*(..))",
			throwing = "exception")
		public void logAfterException(JoinPoint joinPoint, Object exception) {
			logger.info("Exception in {} returned with: {}", joinPoint, exception);
	}  
	
	@After(value = "execution(* com.desmond.sprintaop.business.*.*(..))")
	public void logAfterMethod(JoinPoint joinPoint) {
		logger.info("After {}", joinPoint);
	}
}
