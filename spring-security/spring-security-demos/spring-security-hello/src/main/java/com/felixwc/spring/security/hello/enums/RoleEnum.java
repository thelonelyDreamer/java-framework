package com.felixwc.spring.security.hello.enums;

/**
 * in order to learn java!
 * created at 2022/2/28 20:42
 *
 * @author wangchao
 */
public enum  RoleEnum {
    LV0(0,"lv0"),LV1(1,"lv1"),
    LV2(2,"lv2"),LV3(3,"lv3"),
    LV4(4,"lv4"),ADMIN(5,"lv5"),
    ROOT(6,"lv6"),USER(7,"lv7");

    private int index;
    private String role;
    RoleEnum(int index, String role) {
        this.index = index;
        this.role=role;
    }

    public String getRole() {
        return role;
    }

    public static String getRole(int index){
        String result =null;
        RoleEnum[] values = RoleEnum.values();
        for (int i = 0; i < values.length; i++) {
            if(i==index){
                result=values[i].getRole();
                break;
            }
        }
        return result;
    }
}
