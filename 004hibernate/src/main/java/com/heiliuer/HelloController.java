package com.heiliuer;

import com.heiliuer.config.AppCommonProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    AppCommonProperties appCommonProperties;

    @Autowired
    UserDao userDao;


    @RequestMapping("/")
    @ResponseBody
    Iterable<User> home() {
        Iterable<User> all = userDao.findAll();
        return all;
    }


}