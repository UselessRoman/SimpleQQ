package com.wjc;

import com.wjc.config.SpringConfig;
import com.wjc.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class APP {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        UserService userService = ctx.getBean(UserService.class);

        System.out.println(userService.findPasswordByID(1));

        System.out.println(userService.addNewUser("wwww", "www", 6));
    }
}
