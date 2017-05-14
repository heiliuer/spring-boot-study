/*
 * Copyright (c) 2017. heiliuer heiliuer@gmail.com
 */

package com.heiliuer.reservetion;

import com.heiliuer.reservetion.dao.PermissionDao;
import com.heiliuer.reservetion.dao.UserInfoDao;
import com.heiliuer.reservetion.entity.Permission;
import com.heiliuer.reservetion.entity.UserInfo;
import com.heiliuer.reservetion.utils.Utils;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by hao.wang on 2017/2/28.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class InitDatabaseTest extends TestCase {


    @Autowired
    private UserInfoDao userInfoDao;
    @Autowired
    private PermissionDao permissionDao;


    @Test
    public void getUserInfoDao() {


        Permission permission = new Permission();
        permission.setPermission(Utils.PERMISSION_ADMIN);
        permission.setTitle("管理员");

        permissionDao.save(permission);


//        Set<Reservation> reservations = new HashSet<>();
//        for (int i = 0; i < 10; i++) {
//            Reservation reservation = new Reservation();
//            reservation.setApplydatetime("");
//            reservation.setAuditordatetime("");
//            reservation.setDatetime("");
//            reservation.setExecute("");
//            reservation.setPass("");
//            reservation.setRefusalreason("");
//            reservation.setTable("");
//            reservation.setUser("");
//        }

        UserInfo userInfo = new UserInfo();
        userInfo.setEmail("heili@qq.com");
        userInfo.setCreditworthiness(1);
        userInfo.setEmployeeNumber("heili@qq.com");
        userInfo.setName("heili@qq.com");
        userInfo.setPassword("heili@qq.com");
        userInfo.setPermission(permission);
        userInfo.setPhone("heili@qq.com");
        userInfo.setSalt("heili@qq.com");
//        userInfo.setReservations(reservations);
        userInfo.setTelephone("heili@qq.com");

        userInfoDao.save(userInfo);

    }
}