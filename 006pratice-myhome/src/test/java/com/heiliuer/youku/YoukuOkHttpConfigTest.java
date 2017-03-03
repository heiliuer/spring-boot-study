package com.heiliuer.youku;

import com.heiliuer.youku.dto.YoukuApiVideoDetailDto;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

/**
 * Created by hao.wang on 2017/2/28.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class YoukuOkHttpConfigTest extends TestCase {


    @Autowired
    private YoukuVideoParser youkuVideoParser;

    @Test
    public void testYoukuOkhttpClient() throws Exception {
        Optional<YoukuApiVideoDetailDto> parse = youkuVideoParser.parse(631595852, 315070);
        Assert.assertTrue(parse.isPresent());
        Assert.assertEquals(parse.get().getData().getIteCount(), 14);
    }

    @Autowired
    ScheduledTasks scheduledTasks;

    @Test
    public void testYoukuScheduledTasks() throws Exception {
        scheduledTasks.checkYouku();
    }

}