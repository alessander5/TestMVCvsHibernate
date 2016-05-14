package com.springapp.mvc.service;


import com.springapp.mvc.dao.IUserDao;
import com.springapp.mvc.domein.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Infy on 10.03.2016.
 */
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Transactional
    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Transactional
    @Override
    public User getUserById(int id) {
        return userDao.findById(id);
    }

    @Transactional
    @Override
    public void deleteUser(User user) {
        userDao.remove(user);
    }
}
