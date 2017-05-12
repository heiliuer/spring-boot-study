package com.heiliuer.reservetion.dao;

import com.heiliuer.reservetion.entity.ExperimentTable;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface ExperimentTableDao extends CrudRepository<ExperimentTable, Long> {
}