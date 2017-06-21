package com.heiliuer.youku;

import com.heiliuer.youku.dao.RecordDao;
import com.heiliuer.youku.dto.YoukuApiVideoDetailDto;
import com.heiliuer.youku.entity.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.thymeleaf.TemplateEngine;

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
    public void checkYouku() {
        System.out.println("现在时间：" + dateFormat.format(new Date()));
        //        vid=631595852&showid=315070&

        Integer vid = 631595852;
        Integer showid = 315070;

        parseRecord(vid, showid, "我的狐仙老婆");

    }

    public void parseRecord(Integer vid, Integer showid, String name) {
        Optional<YoukuApiVideoDetailDto> parse = youkuVideoParser.parse(vid, showid);

        if (parse.isPresent()) {
            //最新一集  getEpisode_last 不是最新一集 坑爹 getIteCount 才是
            YoukuApiVideoDetailDto detail = parse.get();

            Integer episodeLast = detail.getData().getIteCount();

            Optional<Record> recordOptional = recordDao.findByVideoId(vid);

            if (recordOptional.isPresent()) {
                Record record = recordOptional.get();
                Integer prevEpisodeLast = record.getEpisodeLast();
                record.setEpisodeLast(episodeLast);
                record.setLatestCheckTime(System.currentTimeMillis());
                recordDao.save(record);

                if (!Objects.equals(prevEpisodeLast, episodeLast)) {
                    sendEmailForEpisodeLastChanged(detail, record);
                }

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


    @Autowired
    EmailService emailService;

    @Async
    private void sendEmailForEpisodeLastChanged(YoukuApiVideoDetailDto detail, Record record) {
        Map<String, Object> data = new HashMap<>();
        data.put("record", record);
        data.put("detail", detail);
        emailService.sendTemplateMail(record.getName() + " 更新了，最新第" + record.getEpisodeLast() + "集", "heiliuer@qq.com", "email/changed", data);
    }


}