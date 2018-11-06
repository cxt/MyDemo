package com.cxt.dao.redis;

import com.alibaba.fastjson.JSON;
import com.cxt.constant.RedisConstants;
import com.cxt.dao.UserMapper;
import com.cxt.exception.UnImplementException;
import com.cxt.model.User;
import com.cxt.util.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * author Administrator
 * date   2018/10/29
 */
@Component("userRedis")
public class UserDaoRedisImpl implements UserMapper {

    @Autowired
    private RedisUtils redisUtils;

    @Override
    public User getUserByUid(long uid) {
        Object o = redisUtils.hget(RedisConstants.USER_UID, Long.toString(uid));
        return (User) o;
    }

    @Override
    public User getUserByName(String name) {
        throw new UnImplementException();
    }

    @Override
    public List<User> listAll(){
        throw new UnImplementException();
    }

    @Override
    public long countAll() {
        throw new UnImplementException();
    }

    @Override
    public boolean insert(User user) {
        Long uid = user.getUid();
        String userJsonStr = JSON.toJSONString(user);
        redisUtils.hset(RedisConstants.USER_UID, Long.toString(uid), userJsonStr);
        return true;
    }

    @Override
    public boolean delete(long uid) {
        throw new UnImplementException();
    }

    @Override
    public boolean update(User user) {
        throw new UnImplementException();
    }
}
