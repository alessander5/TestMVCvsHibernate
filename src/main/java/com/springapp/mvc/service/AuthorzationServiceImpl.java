package com.springapp.mvc.service;

import com.springapp.mvc.dao.IAuthorizationDao;
import com.springapp.mvc.domein.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Infy on 07.03.2016.
 */
@Service
public class AuthorzationServiceImpl implements IAuthorzationService {
    @Autowired
    private IAuthorizationDao authorizationDao;

    @Transactional
    @Override
    public void saveAuth(Authorization auth) {
        authorizationDao.save(auth);
    }

    @Override
    public void updateAuth(Authorization auth) {
        Authorization entity = authorizationDao.findById(auth.getId());
        if(entity!=null){
            entity.setLogin(auth.getLogin());
            entity.setPassword(auth.getPassword());
            entity.setRole(auth.getRole());
            auth.setUser(auth.getUser());
        }
    }

    @Override
    public void deleteAuth(Authorization auth) {
        authorizationDao.remove(auth);
    }

    @Transactional
    @Override
    public void deleteAuthById(int id) {
        authorizationDao.removeById(id);
    }

    @Override
    public List<Authorization> getAllAuthList() {
        return authorizationDao.getList();
    }

    @Override
    public List<Authorization> getAuthListByRole() {
        return authorizationDao.getListByRole(1);
    }
}
