package com.heiliuer.rest;

import com.heiliuer.youku.dao.UserInfoModelDao;
import com.heiliuer.youku.entity.UserInfoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserInfoController {


    @Autowired
    UserInfoModelDao userInfoModelDao;


    @RequestMapping("list")
    @ResponseBody
    Iterable<UserInfoModel> list(Model model) {
        Iterable<UserInfoModel> users = userInfoModelDao.findAll();
        return users;
    }

    @RequestMapping("login")
    @ResponseBody
    Iterable<UserInfoModel> login(String username, String password) {
        Iterable<UserInfoModel> users = userInfoModelDao.findAll();
        return users;
    }
}