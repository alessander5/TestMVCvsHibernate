package com.springapp.mvc.service;

import com.springapp.mvc.domein.Authorization;

import java.util.List;

/**
 * Created by Infy on 07.03.2016.
 */
public interface IAuthorzationService{
    void saveAuth(Authorization auth);
    void updateAuth(Authorization auth);
    void deleteAuth(Authorization auth);
    void deleteAuthById(int id);
    List<Authorization> getAllAuthList();
    List<Authorization> getAuthListByRole();
}
