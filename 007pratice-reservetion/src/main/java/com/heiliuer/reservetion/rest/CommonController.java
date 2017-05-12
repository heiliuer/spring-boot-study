package com.heiliuer.reservetion.rest;

import com.heiliuer.reservetion.utils.Utils;
import com.heiliuer.reservetion.dao.ExperimentTableDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/common")
public class CommonController {


    @Autowired
    ExperimentTableDao experimentTableModelDao;


    @RequestMapping("info")
    Object list(HttpServletRequest request) {
        Map<String, Object> data = new HashMap<>();
        data.put("serverTime", System.currentTimeMillis());
        data.put("isLogged", Utils.isLogged(request));
        return data;
    }

}