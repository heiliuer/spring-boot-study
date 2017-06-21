package com.heiliuer.utils;

import java.util.Date;

/**
 * Created by Administrator on 2017/3/1 0001.
 */
public class MyDate {

    public static Date getDate(Long timestamp) {
        if (timestamp == null) {
            return null;
        }
        return new Date(timestamp);
    }
}
