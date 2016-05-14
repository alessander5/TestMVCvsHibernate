package com.springapp.mvc.dao;

import com.springapp.mvc.domein.User;

import java.util.List;

/**
 * Created by Infy on 10.03.2016.
 */
public interface IUserDao {
    void save(User user);
    void remove(User user);
    User findById(int id);
    void removeById(int id);
    List<User> getList();
}
