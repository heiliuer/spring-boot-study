package com.heiliuer.reservetion.rest;

import com.google.common.collect.ImmutableMap;
import com.google.gson.Gson;
import com.heiliuer.reservetion.dao.UserInfoDao;
import com.heiliuer.reservetion.dto.LoginDto;
import com.heiliuer.reservetion.entity.UserInfo;
import com.heiliuer.reservetion.utils.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import static com.heiliuer.reservetion.utils.Constants.SESSION_KEY_LOGGED;

@RestController
@RequestMapping("user")
@Api(description = "用户管理")
public class UserInfoController {

    static final Logger logger = LoggerFactory.getLogger(UserInfoController.class);

    @Autowired
    UserInfoDao userInfoModelDao;


    @ApiOperation("获取所有用户")
    @RequestMapping(value = "list", method = RequestMethod.GET)
    Iterable<UserInfo> list(Model model) {
        Iterable<UserInfo> users = userInfoModelDao.findAll();
        return users;
    }

    @ApiOperation("登录")
    @RequestMapping(value = "login", method = RequestMethod.POST)
    ResponseEntity<JsonResult> login(@RequestBody @Valid LoginDto login, BindingResult result, HttpSession session) {

        if (result.hasErrors()) {
            return ResponseEntity.badRequest().body(new JsonResult(JsonResult.STATUS_ERROR, result));
        }

        logger.info(new Gson().toJson(login));

        if ("admin".equalsIgnoreCase(login.getUsername()) && "admin".equalsIgnoreCase(login.getPassword())) {
            session.setAttribute(SESSION_KEY_LOGGED, true);
            return ResponseEntity.ok(new JsonResult(JsonResult.STATUS_OK, "登录成功"));
        } else {
            return ResponseEntity.ok(new JsonResult(JsonResult.STATUS_ERROR, "密码或者账户错误"));
        }
    }

    @ApiOperation("检查是否登录")
    @RequestMapping(value = "logged", method = RequestMethod.GET)
    ResponseEntity<JsonResult> logged(HttpServletRequest request) {
        Boolean logged = (Boolean) request.getSession().getAttribute(SESSION_KEY_LOGGED);
        logged = logged == null ? false : logged;

        return ResponseEntity.ok(new JsonResult(JsonResult.STATUS_OK, "success", ImmutableMap.of("logged", logged)));
    }
}