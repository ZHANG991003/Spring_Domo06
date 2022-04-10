package com.itheima;

import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoginTest {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService =(UserService) ac.getBean("userService");
        boolean flag =userService.login("张三","123");
        if (flag){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
    }
}
