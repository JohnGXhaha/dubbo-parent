package com.gx.server;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 37641
 */
@EnableDubbo
@SpringBootApplication
public class DubboServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboServerApplication.class, args);
    }

}
