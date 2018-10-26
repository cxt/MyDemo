package com.cxt.service.impl;

import com.cxt.dao.UserMapper;
import com.cxt.dao.impl.UserMapperMysqlImpl;
import com.cxt.model.User;
import com.cxt.service.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author Administrator
 * date   2018/10/26
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapperMysqlImpl userMapper;

    @Override
    public User getUserByUid(long uid) {
        if (uid > 0L) {
            return userMapper.getUserByUid(uid);
        }
        return null;
    }

    @Override
    public User getUserByName(String name) {
        if (StringUtils.isEmpty(name)){
            return userMapper.getUserByName(name);
        }
        return null;
    }

    @Override
    public List<User> listAll() {
        return userMapper.listAll();
    }

    @Override
    public long countAll() {
        return userMapper.countAll();
    }

    @Override
    public boolean insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public boolean delete(long uid) {
        return userMapper.delete(uid);
    }

    @Override
    public boolean update(User user) {
        if(null != user.getUid() && user.getUid() > 0L){
            return userMapper.update(user);
        }
        return false;
    }
}
