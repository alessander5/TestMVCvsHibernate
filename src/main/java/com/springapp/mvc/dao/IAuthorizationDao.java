package com.springapp.mvc.dao;

import com.springapp.mvc.domein.Authorization;

import java.util.List;

/**
 * Created by Infy on 07.03.2016.
 */
public interface IAuthorizationDao {
    void save(Authorization auth);
    void remove(Authorization auth);
    Authorization findById(int id);
    void removeById(int id);
    List<Authorization> getList();
    List<Authorization> getListByRole(int role);
}
