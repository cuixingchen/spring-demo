package com.cuixingchen.spring.service.impl;

import com.cuixingchen.spring.service.IndexService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by cuipengfei1 on 2017/9/8.
 */
@Service
public class IndexServiceImpl implements IndexService {

    private static final Logger logger = LoggerFactory.getLogger(IndexServiceImpl.class);

    @Override
    public void printIndex(String param) {
        logger.info("IndexServiceImpl->printIndex param:" + param);
    }
}
