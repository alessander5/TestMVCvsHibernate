package com.infy.dao;

import com.infy.domein.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Infy on 12.03.2016.
 */
    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(locations = {
           "classpath:WEB-INF/mvc-dispatcher-servlet.xml"})
public class UserDaoTest {
    /*@Autowired
    private IUserDao userDao;

    @Test
    @Transactional
    public void findUser() {
        User user = userDao.findById(1);
        assertEquals(user.getName(),"test");
    }

    @Test
    @Transactional
    public void deleteTest() {
        User user = userDao.findById(3);
        assertNotNull(user);
        userDao.remove(userDao.findById(3));
        user = userDao.findById(3);
        assertNull(user);
    }*/
}
