package com.jspiders.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.studentdto.Bike;
import com.jspiders.studentdto.Car;
import com.jspiders.studentdto.Student;

public class App {
    public static void main(String[] args) {
       ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext ("META-INF/beans.xml");
       
       
       System.out.println(context.getBean("std1",Student.class));
       System.out.println(context.getBean(Car.class));
       System.out.println(context.getBean(Bike.class));
       
       // context =new FileSystemXmlApplicationContext ("xml-file");
      
    }
}
