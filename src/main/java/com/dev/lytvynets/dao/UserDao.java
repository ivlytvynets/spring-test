package com.dev.lytvynets.dao;

import com.dev.lytvynets.model.User;
import java.util.List;
import java.util.Optional;

public interface UserDao {
    void add(User user);

    Optional<User> get(Long id);

    List<User> listUsers();
}
