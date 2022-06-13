package com.felixwc.dao;

import com.felixwc.pojo.Person1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * in order to learn java!
 * created at 2022/6/8 18:43
 *
 * @author felixwc
 */
public interface Person1Repository extends JpaRepository<Person1,Long>, JpaSpecificationExecutor {


    List<Person1> findPerson1ByAgeLessThan(int age);
}
