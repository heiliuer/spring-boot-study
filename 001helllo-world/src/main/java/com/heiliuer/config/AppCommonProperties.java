package com.heiliuer.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * Created by Heiliuer on 2016/11/25.
 */
@ConfigurationProperties(prefix = "app_common", ignoreUnknownFields = false)
public class AppCommonProperties {
    private String name;

    private List<String> ages;

    public List<String> getAges() {
        return ages;
    }

    public void setAges(List<String> ages) {
        this.ages = ages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
