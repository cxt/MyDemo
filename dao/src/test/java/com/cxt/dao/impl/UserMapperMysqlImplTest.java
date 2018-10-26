package com.cxt.dao.impl;

import com.cxt.dao.UserMapper;
import com.cxt.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.*;


/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:spring-dao.xml"})
// 测试操作的回滚设置
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = true)
@Transactional
public class UserMapperMysqlImplTest {
    @Autowired
    private  UserMapper userMapper;

    @Test
    public void getUserByUid() {
        User user = userMapper.getUserByUid(1L);
        Assert.assertTrue(user!=null);
    }

    @Test
    public void getUserByName() {
        User user = userMapper.getUserByName("cxt");
        Assert.assertTrue(user != null);
    }

    @Test
    public void listAll() {
        List<User> users = userMapper.listAll();
        Assert.assertTrue(users.size() > 0);
    }

    @Test
    public void countAll() {
        long countAll = userMapper.countAll();
        Assert.assertTrue(countAll > 0);
    }

    @Test
    public void insert() {
        User user = new User();
        user.setAge(12);
        user.setName("niubi");
        user.setPassword("123");
        Assert.assertTrue(userMapper.insert(user));
    }

    @Test
    public void delete() {
        Assert.assertTrue(userMapper.delete(4L));
    }

    @Test
    public void update() {
        User user = new User();
        user.setPassword("qwer");
        user.setName("niubi");
        user.setAge(14);
        user.setUid(4L);
        Assert.assertTrue(userMapper.update(user));
    }
}