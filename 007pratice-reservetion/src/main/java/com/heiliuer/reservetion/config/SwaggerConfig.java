package com.heiliuer.reservetion.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "reservetion REST API",
                "reservetion api",
                "1.1",
                "http://www.heiliuer.com",
                new Contact("heiliuer", "http://www.heiliuer.com", "heiliuer@qq.com"),
                "MIT",
                "http://www.heiliuer.com");
        return apiInfo;
    }


    /**
     * 访问 http://localhost:8080/swagger-ui.html
     *
     * @return
     */
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).pathMapping("") //（web app context） api路由的前綴
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }
}