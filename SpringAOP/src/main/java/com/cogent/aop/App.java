package com.cogent.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
       Operation opt = context.getBean(Operation.class);
       opt.caller();
       System.out.println(opt.allproduct());
//       opt.series();
       opt.display();
    }
}
