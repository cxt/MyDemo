package com.cxt.dao;

import com.cxt.model.User;

import java.util.List;
  
  
/**
 * 处理用户的数据操作接口
 * @author liuyazhuang
 *
 */
public interface UserMapper {  
      
    Integer insert(User u);
      
    List<User> findAll();  
      
    List<User> findByUserIds(List<Integer> userIds);  
      
  
}  