package com.heiliuer.reservetion.dao;

import com.heiliuer.reservetion.entity.Company;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface CompanyDao extends CrudRepository<Company, Long> {
}