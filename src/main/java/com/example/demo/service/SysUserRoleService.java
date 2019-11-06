package com.example.demo.service;

import com.example.demo.dao.SysUserRoleMapper;
import com.example.demo.entity.SysUserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName :   tantao
 * @Description: TODO
 * @Author: Administrator
 * @CreateDate: 2019/11/6 10:32
 * @Version: 1.0
 */
@Service
public class SysUserRoleService {
    @Autowired
    private SysUserRoleMapper userRoleMapper;

    public List<SysUserRole> listByUserId(Integer userId) {
        return userRoleMapper.listByUserId(userId);
    }
}

