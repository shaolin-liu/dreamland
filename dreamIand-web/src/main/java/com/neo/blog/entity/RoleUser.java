package com.neo.blog.entity;

import java.io.Serializable;

/**
 *
 * 用户角色
 * @author Neo
 */
public class RoleUser implements Serializable {
    private static final long serialVersionUID = 6715294122153649062L;
    private Long id;

    private Long userId;

    private Long roleId;

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

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}