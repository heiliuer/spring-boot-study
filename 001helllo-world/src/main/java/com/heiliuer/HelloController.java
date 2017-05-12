package com.heiliuer;

import com.heiliuer.config.AppCommonProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HelloController {

    @Value("${app_common.ages}")
    private List<String> ages;
    @Autowired
    AppCommonProperties appCommonProperties;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello " + appCommonProperties.getName() + "";
    }


}