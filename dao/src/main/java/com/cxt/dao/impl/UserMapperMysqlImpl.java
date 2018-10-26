package com.cxt.dao.impl;

import com.cxt.dao.UserMapper;
import com.cxt.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * author Administrator
 * date   2018/10/22
 */
@Repository
public class UserMapperMysqlImpl implements UserMapper {

    @Autowired
    private UserMapper userDao;

    @Override
    public User getUserByUid(long uid) {
        return userDao.getUserByUid(uid);
    }

    @Override
    public User getUserByName(String name) {
        return userDao.getUserByName(name);
    }

    @Override
    public List<User> listAll() {
        return userDao.listAll();
    }

    @Override
    public long countAll() {
        return userDao.countAll();
    }

    @Override
    public boolean insert(User user) {
        return userDao.insert(user);
    }

    @Override
    public boolean delete(long uid) {
        return userDao.delete(uid);
    }

    @Override
    public boolean update(User user) {
        return userDao.update(user);
    }
}
