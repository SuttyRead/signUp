package com.ua.sutty.authorization.service;

import com.ua.sutty.authorization.models.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    void deleteUser(Long id);

    void update(User user);

    User getUserById(Long id);

    List<User> getAllUsers();

}
