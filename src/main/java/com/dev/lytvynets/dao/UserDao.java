package com.dev.lytvynets.dao;

import com.dev.lytvynets.model.User;
import java.util.List;

public interface UserDao {
    void add(User user);

    List<User> listUsers();
}
