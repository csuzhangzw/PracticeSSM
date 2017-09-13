package com.epic.system.dto;

/**
 * 用户dto实体类.
 * @author zhangzw
 */
public class User {
    private Long userId;

    private String userCode;

    private String userName;

    public User(Long userId, String userCode, String userName) {
        this.userId = userId;
        this.userCode = userCode;
        this.userName = userName;
    }

    public User() {
        super();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
}