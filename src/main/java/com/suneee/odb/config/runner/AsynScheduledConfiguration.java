package com.suneee.odb.config.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import java.util.concurrent.Executors;

/**
 * 多线程异步执行定时任务
 * @ClassName: AsynScheduledConfiguration
 * @Author: ChenBo
 * @DateTime: 2018/12/21:13:56
 */
@SpringBootConfiguration
@Slf4j
public class AsynScheduledConfiguration implements SchedulingConfigurer {

    @Override
    public void configureTasks (ScheduledTaskRegistrar taskRegistrar) {
        taskRegistrar.setScheduler (Executors.newScheduledThreadPool (5));
    }
}
