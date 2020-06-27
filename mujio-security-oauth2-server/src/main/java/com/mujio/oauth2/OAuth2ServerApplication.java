package com.mujio.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


/** 
* @Description: 认证服务器，用于获取 Token 
* @Author: GZY
* @Date: 2020/6/26 0026
*/ 
@SpringBootApplication
@MapperScan(basePackages = "com.mujio.oauth2.server.mapper")
public class OAuth2ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OAuth2ServerApplication.class, args);
    }

}
