package com.sugar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication：标注这个类是一个Springboot的应用
@SpringBootApplication
public class Springboot01HelloworldApplication {

    public static void main(String[] args) {
        // 将Springboot应用启动
        // SpringApplication类
        // run方法
        SpringApplication.run(Springboot01HelloworldApplication.class, args);
    }
}
