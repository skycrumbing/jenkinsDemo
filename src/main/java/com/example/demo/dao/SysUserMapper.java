package com.example.demo.dao;

import com.example.demo.entity.SysUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @ClassName :   SysUserMapper
 * @Description: TODO
 * @Author: tantao
 * @CreateDate: 2019/11/6 10:25
 * @Version: 1.0
 */
@Mapper
public interface SysUserMapper {
    @Select("SELECT * FROM sys_user WHERE id = #{id}")
    SysUser selectById(Integer id);

    @Select("SELECT * FROM sys_user WHERE name = #{name}")
    SysUser selectByName(String name);

    @Insert("INSERT sys_user values (null, #{name}, 123)")
    int addUser(String name);
}
