package com.smart.service;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


@SpringBootTest
public class TestLogServiceTest {
    @Resource
    TestLogService testLogService;

    @Test
    public void testInfo() {
        testLogService.testInfo();
    }

    @Test
    public void testError() {
        testLogService.testError();
    }

    @Test
    public void testDebug() {
        testLogService.testDebug();
    }
}