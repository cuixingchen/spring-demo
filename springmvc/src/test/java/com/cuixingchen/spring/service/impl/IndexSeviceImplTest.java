package com.cuixingchen.spring.service.impl;

import com.cuixingchen.spring.service.BaseServiceTest;
import com.cuixingchen.spring.service.IndexService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by cuipengfei1 on 2017/9/8.
 */
public class IndexSeviceImplTest extends BaseServiceTest {

    @Autowired
    private IndexService indexServiceImpl;

    @Test
    public void printIndexTest() {
        indexServiceImpl.printIndex("单元测试");
    }
}
