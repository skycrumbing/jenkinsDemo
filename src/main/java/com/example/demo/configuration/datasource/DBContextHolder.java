package com.example.demo.configuration.datasource;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName: DBContextHolder
 * @Description: TODO
 * @Author: tantao
 * @CreateDate: 2019/11/8 9:23
 * @Version: 1.0
 */
public class DBContextHolder {
    private static final ThreadLocal<DBTypeEnum> contextHolder = new ThreadLocal<>();

//    private static final AtomicInteger counter = new AtomicInteger(-1);

    public static void set(DBTypeEnum dbType) {
        contextHolder.set(dbType);
    }

    public static DBTypeEnum get() {
        return contextHolder.get();
    }

    public static void master() {
        set(DBTypeEnum.MASTER);
        System.out.println("切换到MASTER");
    }

    public static void slave() {
        set(DBTypeEnum.SLAVE);
        System.out.println("切换到SLAVE");
    }

}
