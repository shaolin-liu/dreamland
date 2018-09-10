package com.neo.blog.entity;

import java.io.Serializable;

/**
 *
 * 角色资源
 * @author Neo
 */
public class RoleResource implements Serializable {
    private static final long serialVersionUID = -3189975821770477091L;
    private Long id;

    private Long roleId;

    private Long resourceId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }
}