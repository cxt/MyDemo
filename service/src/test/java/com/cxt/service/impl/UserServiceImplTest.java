package com.cxt.service.impl;

import com.cxt.model.User;
import com.cxt.service.IUserService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * author Administrator
 * date   2018/10/29
 */
public class UserServiceImplTest extends BaseTest {

    @Autowired
    private IUserService userService;

    @Test
    public void getUserByUid() {
        User user = userService.getUserByUid(4L);
        Assert.assertTrue(user !=null);
    }

    @Test
    public void getUserByName() {
    }

    @Test
    public void listAll() {
    }

    @Test
    public void countAll() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void update() {
    }
}