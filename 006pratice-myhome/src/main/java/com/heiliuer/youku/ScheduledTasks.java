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
}