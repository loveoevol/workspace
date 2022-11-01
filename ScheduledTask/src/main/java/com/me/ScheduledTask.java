package com.me;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 吴文涛 on  2022/11/1 21:59
 *
 * @author 吴文涛
 * @version 1.0
 * @since 1.0
 */

@Component
public class ScheduledTask {
    private static final Logger logger = LoggerFactory.getLogger(ScheduledTask.class);
    private static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void scheduleTaskForPrintTime() {
        logger.info("current time is {}",format.format(new Date()));
    }
}
