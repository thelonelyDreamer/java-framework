package com.felixwc.mybatis.plus.sample.crud.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * in order to learn java!
 * created at 2022/2/21 02:21
 *
 * @author wangchao
 */
@Data
@Accessors(chain = true)
public class User {

    private Long id;
    private String name;
    private Integer age;
    private String email;
    @TableField(exist = false)
    private String ignoreColumn = "ignoreColumn";

    @TableField(exist = false)
    private Integer count;
}
