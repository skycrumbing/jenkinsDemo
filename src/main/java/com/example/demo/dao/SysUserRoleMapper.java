package com.example.demo.dao;

import com.example.demo.entity.SysUserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName :   SysUserRoleMapper
 * @Description: TODO
 * @Author: tantao
 * @CreateDate: 2019/11/6 10:28
 * @Version: 1.0
 */
@Mapper
public interface SysUserRoleMapper {
    @Select("SELECT * FROM sys_user_role WHERE user_id = #{userId}")
    List<SysUserRole> listByUserId(Integer userId);
}