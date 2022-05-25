package com.felixwc.springboot.swagger2.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * in order to learn java!
 * created at 2021/9/18 23:32
 *
 * @author wangchao
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
@ApiModel
public class User {
    private long id;
    @ApiModelProperty
    private String name;
}
