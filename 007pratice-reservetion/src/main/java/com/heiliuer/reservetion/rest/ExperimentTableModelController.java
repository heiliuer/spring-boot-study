package com.heiliuer.reservetion.rest;

import com.heiliuer.reservetion.dao.ExperimentTableDao;
import com.heiliuer.reservetion.entity.ExperimentTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/table")
public class ExperimentTableModelController {


    @Autowired
    ExperimentTableDao experimentTableModelDao;


    @RequestMapping("list")
    Iterable<ExperimentTable> list(Model model) {
        Iterable<ExperimentTable> users = experimentTableModelDao.findAll();
        return users;
    }

}