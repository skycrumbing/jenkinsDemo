package com.example.demo.dao;

import com.example.demo.entity.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @ClassName :   SysRoleMapper
 * @Description: TODO
 * @Author: tantao
 * @CreateDate: 2019/11/6 10:27
 * @Version: 1.0
 */
@Mapper
public interface SysRoleMapper {
    @Select("SELECT * FROM sys_role WHERE id = #{id}")
    SysRole selectById(Integer id);

    @Select("SELECT * FROM sys_role WHERE name = #{roleName}")
    SysRole selectByName(String roleName);
}
