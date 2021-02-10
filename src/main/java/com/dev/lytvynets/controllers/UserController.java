package com.dev.lytvynets.controllers;

import com.dev.lytvynets.dto.UserResponseDto;
import com.dev.lytvynets.model.User;
import com.dev.lytvynets.service.UserMapper;
import com.dev.lytvynets.service.UserService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    private final UserMapper userMapper;

    public UserController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @GetMapping("/{id}")
    public UserResponseDto get(@PathVariable Long id) {
        return userMapper.getUserResponseDto(userService.get(id).orElseThrow(() ->
                new RuntimeException("There is no user with id: " + id)));
    }

    @GetMapping("/inject")
    public void addUser() {
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
        User sasha = new User();
        sasha.setFirstName("Sasha");
        sasha.setLastName("Lytvynets");
        sasha.setEmail("sasha@email");
        userService.add(ivan);
        userService.add(bohdan);
        userService.add(masha);
        userService.add(sasha);
    }

    @GetMapping
    public List<UserResponseDto> getAll() {
        return userService.listUsers()
                .stream()
                .map(userMapper::getUserResponseDto)
                .collect(Collectors.toList());
    }
}
