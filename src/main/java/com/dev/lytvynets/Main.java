package com.dev.lytvynets;

import com.dev.lytvynets.config.AppConfig;
import com.dev.lytvynets.model.User;
import com.dev.lytvynets.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User ivan = new User();
        ivan.setFirstName("Ivan");
        ivan.setLastName("Lytvynets");
        ivan.setEmail("ivan@email");
        User bohdan = new User();
        bohdan.setFirstName("Bohdan");
        bohdan.setLastName("Kostevich");
        bohdan.setEmail("bohdan@email");
        User masha = new User();
        masha.setFirstName("Masha");
        masha.setLastName("Kotelenets");
        masha.setEmail("masha@email");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.add(ivan);
        userService.add(bohdan);
        userService.add(masha);
        System.out.println(userService.listUsers());
    }
}
