package com.sxj.testSpring.domain;

import lombok.extern.log4j.Log4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Log4j
public class Test {

    public static void main(String[] args){

        ApplicationContext ctx = new ClassPathXmlApplicationContext("testSpring/application-context.xml");
        Student stu = (Student) ctx.getBean("student");
        log.info("stu: "+stu);
    }
}
