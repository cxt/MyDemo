package com.cxt.util;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * author Administrator
 * date   2018/10/30
 */
public class RedisUtils {
    private final static Logger LOG = LoggerFactory.getLogger(RedisUtils.class);
    private int maxTotal=10;
    private int maxIdle=10;
    private int minIdle=0;
    private String hostname= "localhost";
    private int port = 6739;
    private int timeout = 3000;
    private String password=null;
    private JedisPool pool = null;

    public RedisUtils(int maxTotal, int maxIdle, int minIdle, String hostname, int port, int timeout, String password) {
        if(maxTotal > 0){
            this.maxTotal = maxTotal;
        }
        if (maxIdle > 0){
            this.maxIdle = maxIdle;
        }
        if (minIdle >= 0){
            this.minIdle = minIdle;
        }
        if (StringUtils.isNotEmpty(hostname)){
            this.hostname = hostname;
        }
        if (port>0){
            this.port = port;
        }
        if(timeout>0){
            this.timeout = timeout;
        }
        if(StringUtils.isNotEmpty(password)){
            this.password = password;
        }
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxTotal(this.maxTotal);
        poolConfig.setMaxIdle(this.maxIdle);
        poolConfig.setMinIdle(this.minIdle);
        this.pool = new JedisPool(poolConfig, this.hostname, this.port, this.timeout, this.password);
    }

    private void close(Jedis jedis){
        if (null != jedis){
            jedis.close();
        }
    }

    public void set(String key,String value){
        Jedis jedis = null;
        try {
            jedis = this.pool.getResource();
            jedis.set(key, value);
        }catch (Exception e){
            LOG.error("redis set error .",e);
        }finally {
            close(jedis);
        }
    }

    public String get(String key){
        Jedis jedis = null;
        String val = null;
        try {
            jedis = this.pool.getResource();
            val = jedis.get(key);
        }catch (Exception e){
            LOG.error("redis get error .",e);
        }finally {
           close(jedis);
            return val;
        }
    }

    public void hset(String key,String field,String val){
        Jedis jedis = null;
        try {
            jedis = this.pool.getResource();
            jedis.hset(key, field, val);
        }catch (Exception e){
            LOG.error("redis hset error .",e);
        }finally {
            close(jedis);
        }
    }

    public String hget(String key, String field) {
        Jedis jedis = null;
        String val = null;
        try {
            jedis = this.pool.getResource();
            val = jedis.hget(key, field);
        }catch (Exception e){
            LOG.error("redis get error .",e);
        }finally {
            close(jedis);
            return val;
        }
    }

}
