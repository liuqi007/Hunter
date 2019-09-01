package com.jip.hunter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableTransactionManagement  开启事务管理
@MapperScan(value = "com.jip.hunter.dao")//扫描mapper包
public class SpringbootSsmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSsmApplication.class, args);
	}
}
