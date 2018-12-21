package com.suneee.odb;

import com.suneee.odb.config.system.properties.SystemProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableConfigurationProperties(SystemProperties.class)
@EnableScheduling
public class OdbApplication {

    public static void main (String[] args) {
        SpringApplication.run (OdbApplication.class, args);
    }



}