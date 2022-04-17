package com.felixwc.dao;

import com.felixwc.pojo.PersonDo;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface CRUDPersonRepo extends Repository<PersonDo,Long> {
    <S extends PersonDo> S save(S entity);
    Optional<PersonDo> findById(Long primaryKey);
    long count();
    long countDistinctByNameEquals(String name);
}
