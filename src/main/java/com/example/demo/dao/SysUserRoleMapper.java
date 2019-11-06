package com.example.demo.dao;

import com.example.demo.entity.SysUserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName :   tantao
 * @Description: TODO
 * @Author: Administrator
 * @CreateDate: 2019/11/6 10:28
 * @Version: 1.0
 */
@Mapper
public interface SysUserRoleMapper {
    @Select("SELECT * FROM sys_user_role WHERE user_id = #{userId}")
    List<SysUserRole> listByUserId(Integer userId);
}