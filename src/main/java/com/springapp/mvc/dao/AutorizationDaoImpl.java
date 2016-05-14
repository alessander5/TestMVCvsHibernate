package com.springapp.mvc.dao;

import com.springapp.mvc.domein.Authorization;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Infy on 07.03.2016.
 */
@Repository
public class AutorizationDaoImpl extends AbstractDao<Integer,Authorization> implements IAuthorizationDao {

    @Override
    public void save(Authorization auth) {
        saveOrUpdate(auth);
    }

    @Override
    public void remove(Authorization auth) {
        delete(auth);
    }

    @Override
    public List<Authorization> getList() {
        Criteria criteria = createEntityCriteria().addOrder(Order.asc("role"));
        //criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
        return criteria.list();
    }

    @Override
    public List<Authorization> getListByRole(int role) {
        Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("role", role));
        return crit.list();
    }

    @Override
    public Authorization findById(int id) {
        return getByKey(id);
    }

    @Override
    public void removeById(int id) {
       remove(getByKey(id));
    }
}
