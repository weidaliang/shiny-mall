package com.ljj;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableDubbo // 启动dubbo的配置
@SpringBootApplication
@MapperScan("com.ljj.dao")
public class SystemApp {
    public static void main(String[] args) {
        SpringApplication.run(SystemApp.class,args);
    }
}
