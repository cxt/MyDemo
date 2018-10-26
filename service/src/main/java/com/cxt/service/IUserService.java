package com.cxt.service;

import com.cxt.model.User;

import java.util.List;

/**
 * author Administrator
 * date   2018/10/26
 */
public interface IUserService {
    /**
     * get user by uid
     * @param uid
     * @return User
     */
    User getUserByUid(long uid);

    /**
     * get user by name
     * @param name
     * @return User
     */
    User getUserByName(String name);

    /**
     * list all users
     *
     * @return users
     */
    List<User> listAll();

    /**
     * count users
     *
     * @return count
     */
    long countAll();

    /**
     * insert a user
     *
     * @param user
     * @return
     */
    boolean insert(User user);

    /**
     * delete user by uid
     *
     * @param uid
     * @return
     */
    boolean delete(long uid);

    /**
     * update user
     * @param user
     * @return
     */
    boolean update(User user);
}
