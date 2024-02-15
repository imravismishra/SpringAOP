package com.cogent.aop;

import org.springframework.aop.framework.AbstractAdvisingBeanPostProcessor;

public class Operation {

	public void caller() {
		System.out.println("Logic for Caller");
	}

	public int allproduct() {
		System.out.println("Fetching ll product");
		return 10;
	}

	public void series() throws Exception {
		for (int i = 1; i <= 10; i++) {
			if (i == 6) {
				throw new Exception("Exception Found");
			} else {
				System.out.println(i);
			}

		}
	}
	
	public void display()
	{
		System.out.println("Display");
	}

}
