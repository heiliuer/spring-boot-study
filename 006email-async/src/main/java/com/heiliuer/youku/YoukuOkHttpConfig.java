package com.heiliuer.youku;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by hao.wang on 2017/2/28.
 */
@Configuration
public class YoukuOkHttpConfig {

    @Bean
    public OkHttpClient youkuOkhttpClient() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.NONE);
        return new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .retryOnConnectionFailure(true)
                .connectTimeout(15, TimeUnit.SECONDS)
                .build();
    }

    @Bean
    public Retrofit youkuRetrofit(OkHttpClient youkuOkhttpClient) {
        return new Retrofit.Builder()
                .baseUrl("http://api.m.youku.com")
                .client(youkuOkhttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
