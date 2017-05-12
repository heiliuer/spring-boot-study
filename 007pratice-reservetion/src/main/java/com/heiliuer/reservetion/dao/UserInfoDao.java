package com.heiliuer.reservetion.dao;

import com.heiliuer.reservetion.entity.UserInfo;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface UserInfoDao extends CrudRepository<UserInfo, Long> {
}