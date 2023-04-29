package org.example.pojo;

import java.io.Serializable;

/**
 * @author 23167
 * @description Java is the best language
 * @date 2023/4/9--@10:05
 */
public class KV implements Serializable {
    private static final long serialVersionUID  = 1l;
    private String key;
    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "KV{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
