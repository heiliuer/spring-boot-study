package com.heiliuer.email;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

public enum EmailSender {

    STARCLINK_SENDER(EmailSenderConfigs.properties_starclink);

    final Logger logger = LoggerFactory.getLogger(EmailSender.class);

    private SimpleMailSender sender;

    public SimpleMailSender get() {
        return sender;
    }

    EmailSender(Properties properties) {
        String smtpHost = properties.getProperty("email.send.smtpHost");
        String port = properties.getProperty("email.send.port");
        String username = properties.getProperty("email.send.username");
        String password = properties.getProperty("email.send.password");
        if (isParamStringEmpty(smtpHost, port, username, password)) {
            logger.error("smtpHost, port, username, password exist null or empty!");
        } else {
            sender = new SimpleMailSender(smtpHost, port, username, password);
        }
    }

    /**
     * 检查字符串是否为空，全部是空格的情况判为空
     *
     * @param params
     * @return
     */
    public static boolean isParamStringEmpty(Object... params) {
        if (params == null) {
            return true;
        } else {
            for (Object p : params) {
                if (p == null)
                    return true;
                if ((p instanceof CharSequence) && ((CharSequence) p).length() == 0) {
                    return true;
                }
            }
        }
        return false;
    }


}