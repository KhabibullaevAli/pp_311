package com.example.pp_311.dao;

import com.example.pp_311.model.User;

import java.util.List;

public interface UserDao {
    List<User> getUserList();
    User getUserById(int id);
    void save(User user);
    void update (int id, User user);
    void delete (int id);
}
