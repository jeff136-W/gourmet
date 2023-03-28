package com.it.gourmet;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Slf4j
//@Log4j2
@SpringBootApplication
@ServletComponentScan   //扫描filter类@WebFilter注解
@EnableTransactionManagement //开启事务支持
public class GourmetApplication {
    public static void main(String[] args) {
        SpringApplication.run(GourmetApplication.class,args);
        log.info("项目启动成功...");
    }
}
