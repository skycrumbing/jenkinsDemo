package com.example.demo.service;

import com.example.demo.dao.SysRoleMapper;
import com.example.demo.entity.SysRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName :   SysRoleService
 * @Description: TODO
 * @Author: tantao
 * @CreateDate: 2019/11/6 10:31
 * @Version: 1.0
 */
@Service
public class SysRoleService {
    @Autowired
    private SysRoleMapper roleMapper;

    public SysRole selectById(Integer id){
        return roleMapper.selectById(id);
    }

    public SysRole selectByName(String roleName) {
        return roleMapper.selectByName(roleName);
    }
}
