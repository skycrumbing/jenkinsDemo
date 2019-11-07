package com.example.demo.service;

import com.example.demo.dao.SysUserMapper;
import com.example.demo.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName :   SysUserService
 * @Description: TODO
 * @Author: tantao
 * @CreateDate: 2019/11/6 10:29
 * @Version: 1.0
 */
@Service
public class SysUserService {
    @Autowired
    private SysUserMapper userMapper;

    public SysUser selectById(Integer id) {
        return userMapper.selectById(id);
    }

    public SysUser selectByName(String name) {
        return userMapper.selectByName(name);
    }
}
