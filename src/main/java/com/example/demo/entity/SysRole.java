package com.example.demo.entity;
import java.io.Serializable;

/**
 * @ClassName :   SysRole
 * @Description: TODO
 * @Author: tantao
 * @CreateDate: 2019/11/6 10:21
 * @Version: 1.0
 */
public class SysRole implements Serializable {
    static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
