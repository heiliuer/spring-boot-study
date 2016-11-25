package com.heiliuer.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Heiliuer on 2016/11/25.
 */
@Configuration
@ConfigurationProperties(prefix = "app_common", ignoreUnknownFields = false)
public class AppCommonProperties {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
