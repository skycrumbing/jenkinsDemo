package com.example.demo.controller;

import com.example.demo.entity.SysUser;
import com.example.demo.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: UserController
 * @Description: TODO
 * @Author: tantao
 * @CreateDate: 2019/11/8 10:23
 * @Version: 1.0
 */
@RestController
public class UserController {

    @Autowired
    SysUserService userService;

    @RequestMapping("/user/testAop")
    public int tset(@RequestParam String name) {
        SysUser sysUser = userService.test(name);
        return sysUser.getId().intValue();
    }
}
