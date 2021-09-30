package com.jzsjcdlxxzx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


/**
 * 启动程序
 *
 * @author jzsjcdlxxzx
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class JzsjcdlxxzxApplication {
    public static void main(String[] args) {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(com.jzsjcdlxxzx.JzsjcdlxxzxApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  启动成功   ლ(´ڡ`ლ)ﾞ  \n" );
    }

}
