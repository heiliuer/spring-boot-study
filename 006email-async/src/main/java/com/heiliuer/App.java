package com.heiliuer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableConfigurationProperties({LiquibaseProperties.class})
@EnableScheduling
public class App {

    public static void main(String[] args) throws Exception {
        new SpringApplication(App.class).run(args);
    }
}
