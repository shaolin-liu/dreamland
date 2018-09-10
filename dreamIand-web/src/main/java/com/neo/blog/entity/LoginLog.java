package com.neo.blog.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 登录日志
 * @author Neo
 */
public class LoginLog implements Serializable {
    private static final long serialVersionUID = 900086625228907271L;
    private Long id;

    private Long userId;

    private String loginIp;

    private Date loginTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
}