package com.neo.blog.service;

import com.neo.blog.entity.User;

public interface UserService {

    /**
     * 用户注册
     * @param user
     * @return
     */
    int register(User user);

    /**
     * 用户登录
     * @param email
     * @param phone
     * @return
     */
    User login(String email, String phone);

    /**
     * 根据email查询用户
     * @param email
     * @return
     */
    User findByEmail(String email);

    /**
     * 根据手机号码查询用户
     * @param phone
     * @return
     */
    User findByPhone(String phone);

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User findById(Long id);

    /**
     * 根据邮箱删除用户
     * @param email
     * @return
     */
    int deleteByEmail(String email);

    /**
     * 用户信息更新
     * @param user
     * @return
     */
    int update(User user);

}
