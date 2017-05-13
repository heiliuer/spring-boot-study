package com.heiliuer.reservetion.utils;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by hao.wang on 2017-5-12.
 */
public class Utils {
    public static final int PERMISSION_ADMIN = 1;

    public static boolean isLogged(HttpServletRequest request) {
        Boolean isLogged = (Boolean) request.getSession().getAttribute(Constants.SESSION_KEY_LOGGED);
        return isLogged == null ? false : isLogged;
    }
}
