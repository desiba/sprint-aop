package com.desmond.sprintaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class JoinPointConfig {

	@Pointcut("execution(* com.desmond.sprintaop.data.*.*(..))")
	public void dataLayerPointcut() {}
	
	@Pointcut("execution(* com.desmond.sprintaop.business.*.*(..))")
	public void businessLayerPointcut() {}
	
	//to intercept method calls for both layers:
	@Pointcut("com.desmond.sprintaop.aspect.JoinPointConfig.dataLayerPointcut() || "
			+ "com.desmond.sprintaop.aspect.JoinPointConfig.businessLayerPointcut()")
	public void allLayersPointcut() {}
	
	//for a particular bean
	@Pointcut("bean(movie*)")
	public void movieBeanPointcut() {}

    //custom aspect annotation
	@Pointcut("@annotation(com.desmond.sprintaop.aspect.MeasureTime)")
	public void measureTimeAnnotation() {}
}