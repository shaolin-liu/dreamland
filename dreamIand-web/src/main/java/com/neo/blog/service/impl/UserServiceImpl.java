package com.neo.blog.service.impl;

import com.neo.blog.dao.UserMapper;
import com.neo.blog.entity.User;
import com.neo.blog.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * user接口服务实现
 *
 * @author: Neo.lin
 * @date: 2018-09-10 下午3:26
 */
@Service
public class UserServiceImpl implements UserService {
    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    public int register(User user) {
        if (user == null){
            return 0;
        }

        return userMapper.insert(user);
    }

    @Override
    public User login(String email, String phone) {
        if (StringUtils.isEmpty(email) && StringUtils.isEmpty(phone)) {
            return null;
        }

        User user = new User();
        user.setEmail(email);
        user.setPhone(phone);
        return userMapper.selectOne(user);
    }

    @Override
    public User findByEmail(String email) {
        if (StringUtils.isEmpty(email)) {
            return null;
        }

        User user = new User();
        user.setEmail(email);
        return userMapper.selectOne(user);
    }

    @Override
    public User findByPhone(String phone) {
        if (StringUtils.isEmpty(phone)) {
            return null;
        }

        User user = new User();
        user.setPhone(phone);
        return userMapper.selectOne(user);
    }

    @Override
    public User findById(Long id) {
        if (id == null){
            return null;
        }

        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int deleteByEmail(String email) {
        if (StringUtils.isEmpty(email)){
            return 0;
        }

        return userMapper.deleteByEmail(email);
    }

    @Override
    public int update(User user) {
        if (user == null){
            return 0;
        }

        return userMapper.updateByPrimaryKeySelective(user);
    }
}
