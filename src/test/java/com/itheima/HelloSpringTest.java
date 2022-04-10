package com.itheima;

import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringTest extends TestCase {
        @Test
    public void testShow() {
            ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
            HelloSpring helloSpring = (HelloSpring) ac.getBean("helloSpring");
            helloSpring.show();

        }
}