package com.heiliuer.page;

import com.heiliuer.youku.dao.RecordDao;
import com.heiliuer.youku.entity.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecordController {


    @Autowired
    RecordDao userDao;


    @RequestMapping("/records")
    String records(Model model) {
        Iterable<Record> records = userDao.findAll();
        model.addAttribute("records", records);
        return "records";
    }


}