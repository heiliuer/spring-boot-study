package com.heiliuer.email;

import org.assertj.core.util.Lists;
import org.junit.Test;

import javax.mail.MessagingException;

/**
 * Created by heiliuer on 2017/3/1 0001.
 */
public class EmailSenderTest {

    @Test
    public void testSend() throws MessagingException {
        EmailContent emailContent = new EmailContent();

        emailContent.setContent("hello");
        emailContent.setRecipients(Lists.newArrayList("heiliuer@qq.com"));
        EmailSender.STARCLINK_SENDER.get().send(emailContent);
    }
}