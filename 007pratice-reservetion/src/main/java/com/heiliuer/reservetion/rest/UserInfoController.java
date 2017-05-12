package com.heiliuer.reservetion.rest;

import com.heiliuer.reservetion.dao.UserInfoDao;
import com.heiliuer.reservetion.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

import static com.heiliuer.reservetion.utils.Constants.SESSION_KEY_LOGGED;

@RestController
@RequestMapping("/user")
public class UserInfoController {


    @Autowired
    UserInfoDao userInfoModelDao;


    @RequestMapping("list")
    Iterable<UserInfo> list(Model model) {
        Iterable<UserInfo> users = userInfoModelDao.findAll();
        return users;
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    JsonResult login(String username, String password, HttpServletRequest request) {
        System.out.println(username + " " + password);
        // TODO
        if ("admin".equalsIgnoreCase(username) && "admin".equalsIgnoreCase(password)) {
            request.getSession().setAttribute(SESSION_KEY_LOGGED, true);
            return new JsonResult(0, "success");
        }
        return new JsonResult(-1, "failed");
    }

    @RequestMapping("isLogged")
    Object isLogged(HttpServletRequest request) {
        Object logged = request.getSession().getAttribute(SESSION_KEY_LOGGED);
        return logged == null ? false : logged;
    }
}