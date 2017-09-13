package com.epic.system.mapper;

import com.epic.system.dto.User;

import java.util.List;

/**
 * User Mapper function.
 * @author zhangzw
 */
public interface UserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectByUser(User user);
}