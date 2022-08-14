package com.felixwc.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * in order to learn java!
 * created at 2022/7/21 17:20
 *
 * @author felixwc
 */
@Data
@Accessors(chain = true)
public class Grade implements Serializable {
    private Integer id;
    private String name;
}
