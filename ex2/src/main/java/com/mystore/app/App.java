package com.mystore.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] arg) {
        
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Product p1 = context.getBean(Product.class);
                
        //Product p1 = new Product();
        p1.setId(1);
        p1.setName("Tumbler");
        
        System.out.println(p1);
    }  
}