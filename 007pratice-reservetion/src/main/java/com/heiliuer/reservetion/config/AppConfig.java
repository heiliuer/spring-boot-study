package com.heiliuer.reservetion.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Administrator on 2017/3/7 0007.
 */
@Configuration
public class AppConfig extends WebMvcConfigurerAdapter {


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

//    @Bean
//    public WebMvcConfigurerAdapter forwardToIndex() {
//        return new WebMvcConfigurerAdapter() {
//            @Override
//            public void addViewControllers(ViewControllerRegistry registry) {
//                // forward requests to /admin and /user to their index.html
//                registry.addViewController("/").setViewName(
//                        "forward:/static/index.html");
//            }
//        };
//    }

    @Bean
    public LocalValidatorFactoryBean validator() {
        return new LocalValidatorFactoryBean();
    }

}
