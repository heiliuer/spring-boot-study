package com.heiliuer.youku.dao;

import com.heiliuer.youku.entity.UserInfoModel;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface UserInfoModelDao extends CrudRepository<UserInfoModel, Long> {
}