package com.dev.lytvynets.service;

import com.dev.lytvynets.model.User;
import java.util.List;

public interface UserService {
    void add(User user);

    User get(Long id);

    List<User> listUsers();
}
