package com.heiliuer;

import com.heiliuer.config.AppCommonProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.scheduling.annotation.EnableScheduling;

@ComponentScan
@SpringBootConfiguration
@EnableAutoConfiguration
@EnableConfigurationProperties({AppCommonProperties.class, LiquibaseProperties.class})
@EnableScheduling
public class HelloApp {

    private static final Logger logger = LoggerFactory.getLogger(HelloApp.class);

    public static void main(String[] args) throws Exception {
        SpringApplication app = new SpringApplication(HelloApp.class);
        ConfigurableApplicationContext context = app.run(args);
        ConfigurableEnvironment environment = context.getEnvironment();
    }
}
