package com.heiliuer.youku.dao;

import com.heiliuer.youku.entity.CompanyModel;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface CompanyModelDao extends CrudRepository<CompanyModel, Long> {
}