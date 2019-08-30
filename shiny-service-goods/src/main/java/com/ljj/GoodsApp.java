package com.ljj;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo // 启动dubbo的配置
@SpringBootApplication
@MapperScan("com.ljj.dao")
public class GoodsApp {
    public static void main(String[] args) {
        SpringApplication.run(GoodsApp.class,args);
    }
}
