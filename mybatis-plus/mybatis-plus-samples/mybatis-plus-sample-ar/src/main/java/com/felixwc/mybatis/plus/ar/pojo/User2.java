package com.felixwc.mybatis.plus.ar.pojo;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * in order to learn java!
 * created at 2022/2/21 06:26
 *
 * @author wangchao
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class User2 extends Model<User2> {
    private Long id;
    private String name;
    private Integer age;
    private String email;

    @Override
    public Serializable pkVal() {
        /**
         * AR 模式这个必须有，否则 xxById 的方法都将失效！
         * 另外 UserMapper 也必须 AR 依赖该层注入，有可无 XML
         */
        return id;
    }
}
