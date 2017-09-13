package com.epic.system.controller;

import com.epic.system.dto.User;
import com.epic.system.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * user controller.
 * @author zhangzw
 */
@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    /**
     * 根据ID获取用户信息.
     * @param request
     *          请求上下文
     * @param userId
     *          用户ID
     * @return 用户信息
     */
    @RequestMapping(value = "/sys/user/get")
    @ResponseBody
    public User getUser(HttpServletRequest request, Long userId){
        return userService.queryByPrimaryKey(request, userId);
    }
}
