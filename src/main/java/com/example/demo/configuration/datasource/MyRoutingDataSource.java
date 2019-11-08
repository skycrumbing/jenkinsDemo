package com.example.demo.configuration.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.lang.Nullable;

/**
 * @ClassName: MyRoutingDataSource
 * @Description: TODO
 * @Author: tantao
 * @CreateDate: 2019/11/8 9:21
 * @Version: 1.0
 */
public class MyRoutingDataSource extends AbstractRoutingDataSource {
    @Nullable
    @Override
    protected Object determineCurrentLookupKey() {
        return DBContextHolder.get();
    }

}
