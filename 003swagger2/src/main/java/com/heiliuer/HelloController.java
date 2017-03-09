package com.heiliuer;

import com.heiliuer.config.AppCommonProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {


    @Autowired
    AppCommonProperties appCommonProperties;

    @RequestMapping(value = "/test1", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    Info test1(@RequestBody Info info) {
        Info rsInfo = new Info();
        rsInfo.setName(appCommonProperties.getName());
        rsInfo.setAget(25);
        return rsInfo;
    }

    @RequestMapping(value = "/test2", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    Info test2(Info info) {
        Info rsInfo = new Info();
        rsInfo.setName(appCommonProperties.getName());
        rsInfo.setAget(25);
        return rsInfo;
    }


}