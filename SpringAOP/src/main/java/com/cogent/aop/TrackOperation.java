package com.cogent.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {

	@Pointcut("execution (* Operation.*(..))")
	public void myPointCut() {
	} // pointcut name

	@Before("myPointCut()")
	public void mybeforeadvice() {
		System.out.println("My Advice/Logic before Execution");
	}

	@After("myPointCut()")
	public void myafteradvice() {
		System.out.println("My Advice/Logic after Execution");
	}

	@AfterThrowing("myPointCut()")
	public void myafterthrowingadvice() {
		System.out.println("My Advice/Logic after throwing Exception");
	}
	
	
	@AfterReturning("myPointCut()")
	public void myafterreturnadvice() {
		System.out.println("My Advice/Logic after complete Execution");
	}
	
	
	@Pointcut("execution (* Operation.display(..))")
	public void myPointCut2() {
	} // pointcut name
	
	@Around("myPointCut2()")
	public Object myaroundAdvice(ProceedingJoinPoint point) throws Throwable
	{
		System.out.println(point.getClass());
		System.out.println("Around 1");
		Object obj = point.proceed();
		System.out.println("Around 2");
		return obj;
	}

}
