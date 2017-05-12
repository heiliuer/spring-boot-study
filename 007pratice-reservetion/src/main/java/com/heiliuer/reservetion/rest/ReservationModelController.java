package com.heiliuer.reservetion.rest;

import com.heiliuer.reservetion.dao.ReservationDao;
import com.heiliuer.reservetion.entity.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservation")
public class ReservationModelController {


    @Autowired
    ReservationDao reservationModelDao;


    @RequestMapping("list")
    Iterable<Reservation> list(String date) {
        Iterable<Reservation> users = reservationModelDao.findAll();
        return users;
    }

}