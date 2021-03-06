package com.heiliuer;

import com.heiliuer.config.AppCommonProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    AppCommonProperties appCommonProperties;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello " + appCommonProperties.getName() + "232323";
    }


}