package com.heiliuer.youku.dao;

import com.heiliuer.youku.entity.Record;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
public interface RecordDao extends CrudRepository<Record, Long> {

    /**
     * This method will find an Record instance in the database by its email.
     * Note that this method is not implemented and its working code will be
     * automagically generated from its signature by Spring Data JPA.
     */
    public Optional<Record> findByVideoId(Integer videoId);

}