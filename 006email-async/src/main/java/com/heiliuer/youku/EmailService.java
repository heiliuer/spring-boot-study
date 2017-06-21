package com.heiliuer.youku;

import java.util.Map;

/**
 * Created by heiliuer on 2017/6/6 0006.
 */

public interface EmailService {
    void sendSimpleMessage(
            String to, String subject, String text);

    void sendTemplateMail(String to, String subject, String emailView, Map<String, ?> maps);
}
