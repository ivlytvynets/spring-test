package com.dev.lytvynets.service.impl;

import com.dev.lytvynets.dao.UserDao;
import com.dev.lytvynets.model.User;
import com.dev.lytvynets.service.UserService;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public User get(Long id) {
        return userDao.get(id).orElseThrow(() ->
                new RuntimeException("There is no user with id: " + id));
    }

    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }
}
