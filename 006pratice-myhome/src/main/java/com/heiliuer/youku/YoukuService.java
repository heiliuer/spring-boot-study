package com.heiliuer.youku;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

/**
 * Created by Administrator on 2016/11/20 0020.
 */
public interface YoukuService {


    @GET("/api/showlist/getshowlist?" +
            "cateid=97&pagesize=50&page=0&callback=getshowlist0")
        //vid=631595852&showid=315070&
    Call<ResponseBody> getDetail(@Query("vid") Integer vid, @Query("showid") Integer showid);


}