package com.example.pp_311.service;

import com.example.pp_311.dao.UserDao;
import com.example.pp_311.model.User;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> getUserList() {
        return userDao.getUserList();
    }

    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    public void save(User user) {
        userDao.save(user);
    }

    public void update(int id, User user) {
        userDao.update(id, user);
    }

    public void delete(int id) {
        userDao.delete(id);
    }

}
