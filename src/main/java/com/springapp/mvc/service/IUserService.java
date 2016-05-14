package com.springapp.mvc.service;

import com.springapp.mvc.domein.User;

/**
 * Created by Infy on 10.03.2016.
 */
public interface IUserService {
    void save(User user);

    User getUserById(int id);

    void deleteUser(User user);
}
