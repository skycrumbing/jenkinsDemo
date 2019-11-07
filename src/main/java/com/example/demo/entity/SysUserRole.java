package com.example.demo.entity;

import java.io.Serializable;

/**
 * @ClassName :   SysUserRole
 * @Description: TODO
 * @Author: tantao
 * @CreateDate: 2019/11/6 10:24
 * @Version: 1.0
 */
public class SysUserRole implements Serializable {
    static final long serialVersionUID = 1L;

    private Integer userId;

    private Integer roleId;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
