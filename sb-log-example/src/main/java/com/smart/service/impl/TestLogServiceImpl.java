package com.smart.service.impl;

import com.smart.service.TestLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TestLogServiceImpl implements TestLogService {
    @Override
    public String testInfo() {
        log.info("info级别的信息");
        return null;
    }

    @Override
    public String testError() {
        log.error("error级别的信息");
        return null;
    }

    @Override
    public String testDebug() {
        log.debug("info级别的信息");
        return null;
    }
}
