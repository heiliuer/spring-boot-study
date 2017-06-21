package com.heiliuer.youku;

import com.google.gson.Gson;
import com.heiliuer.youku.dto.YoukuApiVideoDetailDto;
import okhttp3.ResponseBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by hao.wang on 2017/2/28.
 */
@Component
public class YoukuVideoParser {


    @Autowired
    Retrofit youkuRetrofit;

    static final Logger logger = LoggerFactory.getLogger(YoukuVideoParser.class);

    public Optional<YoukuApiVideoDetailDto> parse(Integer vid, Integer showid) {

        YoukuService youkuService = youkuRetrofit.create(YoukuService.class);


        Call<ResponseBody> reposCall = youkuService.getDetail(vid, showid);

        try {
            Response<ResponseBody> response = reposCall.execute();
            ResponseBody repos = response.body();
            String string = repos.string();
            Matcher matcher = Pattern.compile("getshowlist0\\((.*)\\)").matcher(string);
            while (matcher.find()) {
                String group = matcher.group(1);
                YoukuApiVideoDetailDto youkuApiVideoDetailDto = new Gson().fromJson(group, YoukuApiVideoDetailDto.class);
                return Optional.of(youkuApiVideoDetailDto);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return Optional.ofNullable(null);
    }


}
