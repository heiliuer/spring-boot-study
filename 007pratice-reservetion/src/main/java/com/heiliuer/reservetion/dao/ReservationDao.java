package com.heiliuer.reservetion.dao;

import com.heiliuer.reservetion.entity.Reservation;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface ReservationDao extends CrudRepository<Reservation, Long> {


//    @Query("select u from ReservationModel u where u.datetime = ?1")
//    Iterable<ReservationModel> getListOfDate(Date date);/**/
}