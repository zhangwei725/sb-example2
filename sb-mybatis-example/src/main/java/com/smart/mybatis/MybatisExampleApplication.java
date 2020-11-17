package com.smart.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 记录错误信息
 *
 * 大数据整合
 * E  Elasticsearch
 * L  Logstash
 * K  Kibana
 */

@SpringBootApplication
// 注册mapper接口
@MapperScan("com.smart.mybatis.mapper")
public class MybatisExampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisExampleApplication.class, args);
    }
}
