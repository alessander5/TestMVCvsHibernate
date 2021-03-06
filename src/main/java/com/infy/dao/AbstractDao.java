package com.infy.dao;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

/**
 * Created by Infy on 23.05.2016.
 */

public class AbstractDao<PK extends Serializable, T> {
        private final Class<T> persistentClass;

        public AbstractDao() {
            this.persistentClass = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
        }

        private SessionFactory sessionFactory;

        protected Session getSession(){
            return sessionFactory.getCurrentSession();
        }

        public T getByKey(PK key){
            return  (T) getSession().get(persistentClass,key);
        }

        public void persist(T entity) {
            getSession().persist(entity);
        }

        public void saveOrUpdate(T entity){
            getSession().saveOrUpdate(entity);
        }

        public void delete(T entity) {
            getSession().delete(entity);
        }

        protected Criteria createEntityCriteria(){
            return getSession().createCriteria(persistentClass);
        }

}

