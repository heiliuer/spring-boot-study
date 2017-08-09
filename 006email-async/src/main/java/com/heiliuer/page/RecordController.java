package com.heiliuer.page;

import com.heiliuer.utils.MyDate;
import com.heiliuer.youku.dao.RecordDao;
import com.heiliuer.youku.entity.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/record")
public class RecordController {


    @Autowired
    RecordDao userDao;


    @RequestMapping
    String record(Model model) {
        Iterable<Record> records = userDao.findAll();
        model.addAttribute("records", records);
        model.addAttribute("mydate", new MyDate());
        return "record";
    }


}