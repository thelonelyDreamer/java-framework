package com.felixwc.mybatis.plus.quickstart.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.felixwc.mybatis.plus.quickstart.entity.Person;
import org.springframework.stereotype.Repository;

/**
 * in order to learn java!
 * created at 2022/2/21 02:27
 *
 * @author wangchao
 */
@Repository
public interface PersonMapper extends BaseMapper<Person> {
    Person selectById(Long id);
}
