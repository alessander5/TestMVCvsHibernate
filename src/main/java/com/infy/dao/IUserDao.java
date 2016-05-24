package com.infy.dao;

import com.infy.domein.User;

/**
 * Created by Infy on 23.05.2016.
 */
public interface IUserDao {
    void save(User user);
    void remove(User user);
}
