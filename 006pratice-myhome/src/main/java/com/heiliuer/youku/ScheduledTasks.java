package com.heiliuer.youku;

import com.heiliuer.youku.dao.RecordDao;
import com.heiliuer.youku.dto.YoukuApiVideoDetailDto;
import com.heiliuer.youku.entity.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

@Component
public class ScheduledTasks {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Autowired
    YoukuVideoParser youkuVideoParser;

    @Autowired
    RecordDao recordDao;

    @Scheduled(fixedDelay = 5000)
    public void reportCurrentTime() {
        System.out.println("现在时间：" + dateFormat.format(new Date()));
        //        vid=631595852&showid=315070&
        Integer vid = 631595852;
        Integer showid = 315070;

        Optional<YoukuApiVideoDetailDto> parse = youkuVideoParser.parse(vid, showid);

        parse.ifPresent(detail -> {
            Record byVideoId = recordDao.findByVideoId(vid);
            if (byVideoId == null) {
                Record record = new Record();
                record.setName("我的狐仙老婆");
                record.setShowId(showid);
                record.setVideoId(vid);
                record.setEpisodeLast(Integer.valueOf(parse.get().getData().getEpisode_last()));
                recordDao.save(record);
            }
        });

    }
}