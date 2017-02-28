package com.heiliuer.youku;

import com.heiliuer.email.EmailContent;
import com.heiliuer.email.EmailSender;
import com.heiliuer.youku.dao.RecordDao;
import com.heiliuer.youku.dto.YoukuApiVideoDetailDto;
import com.heiliuer.youku.entity.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import java.text.SimpleDateFormat;
import java.util.*;

@Component
public class ScheduledTasks {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Autowired
    YoukuVideoParser youkuVideoParser;

    @Autowired
    RecordDao recordDao;

    @Autowired
    private TemplateEngine templateEngine;

    @Scheduled(fixedDelay = 1000 * 60 * 20)
    public void reportCurrentTime() {
        System.out.println("现在时间：" + dateFormat.format(new Date()));
        //        vid=631595852&showid=315070&

        Integer vid = 631595852;
        Integer showid = 315070;

        parseRecord(vid, showid, "我的狐仙老婆");

    }

    private void parseRecord(Integer vid, Integer showid, String name) {
        Optional<YoukuApiVideoDetailDto> parse = youkuVideoParser.parse(vid, showid);

        if (parse.isPresent()) {
            Integer episodeLast = Integer.valueOf(parse.get().getData().getEpisode_last());
            Optional<Record> recordOptional = recordDao.findByVideoId(vid);
            if (recordOptional.isPresent()) {
                Record record = recordOptional.get();
                Integer prevEpisodeLast = record.getEpisodeLast();

                if (!Objects.equals(prevEpisodeLast, episodeLast)) {

                }

                sendEmailForEpisodeLastChanged(record);

                record.setEpisodeLast(episodeLast);
                record.setLatestCheckTime(System.currentTimeMillis());
                recordDao.save(record);
            } else {
                Record record = new Record();
                record.setName(name);
                record.setShowId(showid);
                record.setVideoId(vid);
                record.setLatestCheckTime(System.currentTimeMillis());
                record.setEpisodeLast(episodeLast);
                recordDao.save(record);
            }
        } else {

        }
    }

    @Async
    private void sendEmailForEpisodeLastChanged(Record record) {
        Context ctx = new Context(Locale.CHINA);
        ctx.setVariable("record", record);
        String htmlContent = this.templateEngine.process("email/changed", ctx);
        EmailContent emailContent = new EmailContent();

        emailContent.setContent(htmlContent);
        emailContent.setSubject(record.getName() + " 更新了，最新第" + record.getEpisodeLast() + "集");
        ArrayList<String> recipients = new ArrayList<>();
        recipients.add("heiliuer@qq.com");
        emailContent.setRecipients(recipients);
        try {
            EmailSender.STARCLINK_SENDER.get().send(emailContent);
        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }


}