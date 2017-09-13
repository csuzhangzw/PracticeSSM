package com.epic.system.service;

import com.epic.system.dto.User;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 用户接口类.
 * @author zhangzw
 */
public interface IUserService {

    List<User> queryByUser(HttpServletRequest request, User user);

    User queryByPrimaryKey(HttpServletRequest request, Long userId);
}
