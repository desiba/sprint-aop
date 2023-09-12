package com.desmond.sprintaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AccessCheckAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Before("execution(* com.desmond.sprintaop.business..*.*Filtering(..)) || execution(String com.desmond.sprintaop.business..*.*(..))")
	//@Before("execution(String com.desmond.sprintaop.business..*.*(String))")
	//@Before("execution(* com.desmond.sprintaop.business..*.*Filtering(..))")
	//@Before("execution(String com.desmond.sprintaop.business..*.*(..))")
	//@Before("execution(* com.desmond.sprintaop.business.*.*(..))")
	//@Before("execution(* com.desmond.sprintaop.business.*.*(..))")
	public void before(JoinPoint joinPoint) {
		//	logger.info("Intercepted method call");
		logger.info("Intercepted call before execution of: {}", joinPoint);
		
		//access check logic		
	}
    
}
