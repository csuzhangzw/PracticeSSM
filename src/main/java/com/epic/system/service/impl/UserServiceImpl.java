package com.epic.system.service.impl;

import com.epic.system.dto.User;
import com.epic.system.mapper.UserMapper;
import com.epic.system.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 用户接口实现类.
 * @author zhangzw
 */
@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryByUser(HttpServletRequest request, User user) {
        return userMapper.selectByUser(user);
    }

    @Override
    public User queryByPrimaryKey(HttpServletRequest request, Long userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
