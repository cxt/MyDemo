package com.cxt.dao.redis;

import com.cxt.dao.UserMapper;
import com.cxt.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * author Administrator
 * date   2018/10/30
 */
/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:spring-dao.xml"})
public class UserDaoRedisImplTest {
    @Autowired
    @Qualifier("userRedis")
    private UserMapper userRedis;
    @Test
    public void getUserByUid() {
    }

    @Test
    public void insert() {
        User user = new User();
        user.setUid(1L);
        user.setAge(26);
        user.setName("cxt");
        user.setPassword("123");
        userRedis.insert(user);
    }
}