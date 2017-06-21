package com.heiliuer.youku;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.Locale;
import java.util.Map;


@Component
public class EmailServiceImpl implements EmailService {

    @Autowired
    public JavaMailSender emailSender;

    static final Logger logger = LoggerFactory.getLogger(EmailServiceImpl.class);

    /*记住设置from，不然报500错误*/
    @Value("${spring.mail.properties.mail.mail.smtp.from}")
    String mailFrom;

    @Autowired
    private TemplateEngine templateEngine;

    @Async
    @Override
    public void sendSimpleMessage(
            String to, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(mailFrom);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);

        logger.info("sendSimpleMessage to {} ", to);
        emailSender.send(message);
    }

    @Async
    @Override
    public void sendTemplateMail(String to, String subject, String emailView, Map<String, ?> maps) {

        MimeMessage mimeMessage = emailSender.createMimeMessage();

        try {
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
            helper.setFrom(mailFrom);
            helper.setTo(to);
            helper.setSubject(subject);


            Context ctx = new Context(Locale.CHINA);
            ctx.setVariables(maps);

            String htmlContent = templateEngine.process(emailView, ctx);
            helper.setText(htmlContent, true);

            logger.info("sendTemplateMail to {}", to);
            emailSender.send(mimeMessage);
        } catch (MessagingException e) {
            e.printStackTrace();
            logger.error("发送邮件失败 ,to:{}", to);
        }
    }
}