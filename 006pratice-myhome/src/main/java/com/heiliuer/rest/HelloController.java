package com.heiliuer.rest;

import com.heiliuer.config.AppCommonProperties;
import com.heiliuer.youku.dao.RecordDao;
import com.heiliuer.youku.entity.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/record")
public class HelloController {

    @Autowired
    AppCommonProperties appCommonProperties;

    @Autowired
    RecordDao userDao;


    @RequestMapping("/")
    @ResponseBody
    Iterable<Record> home() {
        Iterable<Record> all = userDao.findAll();
        return all;
    }


}