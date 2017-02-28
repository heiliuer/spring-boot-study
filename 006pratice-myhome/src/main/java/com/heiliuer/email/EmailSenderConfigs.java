package com.heiliuer.email;

import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

public class EmailSenderConfigs {

    public static Properties properties_starclink;

    static {
        try {
            properties_starclink = PropertiesLoaderUtils
                    .loadAllProperties("email.sender.properties");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}