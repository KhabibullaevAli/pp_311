package com.example.pp_311.service;

import com.example.pp_311.model.User;

import java.util.List;

public interface UserService {

   public List<User> getUserList();

    public User getUserById(int id);

    public void save(User user);

    public void update(int id, User user);

    public void delete(int id);

}
