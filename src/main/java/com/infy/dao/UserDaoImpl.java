package com.infy.dao;

import com.infy.domein.User;

/**
 * Created by Infy on 23.05.2016.
 */
public class UserDaoImpl extends AbstractDao<Integer, User> implements IUserDao{


    @Override
    public void save(User user) {
        saveOrUpdate(user);
    }

    @Override
    public void remove(User user) {
        delete(user);
    }
}
