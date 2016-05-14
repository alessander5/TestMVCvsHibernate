package com.springapp.mvc.dao;

import com.springapp.mvc.domein.User;

import java.util.List;

/**
 * Created by Infy on 10.03.2016.
 */
public class UserDaoImpl extends AbstractDao<Integer,User> implements IUserDao{


    @Override
    public void save(User user) {
        saveOrUpdate(user);
    }

    @Override
    public void remove(User user) {
        delete(user);
    }

    @Override
    public User findById(int id) {
        return getByKey(id);
    }

    @Override
    public void removeById(int id) {
        remove(getByKey(id));
    }

    @Override
    public List<User> getList() {
        return getList();
    }
}
