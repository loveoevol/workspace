package com.me;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by 吴文涛 on  2022/11/1 21:49
 *
 * @author 吴文涛
 * @version 1.0
 * @since 1.0
 */

@SpringBootApplication
@EnableScheduling
public class ScheduledTaskStartApp {
    public static void main(String[] args) {
        SpringApplication.run(ScheduledTaskStartApp.class,args);
    }
}
