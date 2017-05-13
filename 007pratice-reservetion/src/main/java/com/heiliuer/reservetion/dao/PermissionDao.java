/*
 * Copyright (c) 2017. heiliuer heiliuer@gmail.com
 */

package com.heiliuer.reservetion.dao;

import com.heiliuer.reservetion.entity.Permission;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface PermissionDao extends CrudRepository<Permission, Long> {
}