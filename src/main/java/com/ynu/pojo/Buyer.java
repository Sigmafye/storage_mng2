package com.ynu.pojo;


import org.springframework.stereotype.Component;

/**
 * 采购人员实体类，buyer
 */
@Component
public class Buyer {

    private int u_id;//采购员编号
    private String u_name;//采购员姓名
    private String u_sex;//采购员性别
    private int u_age;//采购员年龄
    private String u_password;//采购员密码

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_sex() {
        return u_sex;
    }

    public void setU_sex(String u_sex) {
        this.u_sex = u_sex;
    }

    public int getU_age() {
        return u_age;
    }

    public void setU_age(int u_age) {
        this.u_age = u_age;
    }

    public String getU_password() {
        return u_password;
    }

    public void setU_password(String u_password) {
        this.u_password = u_password;
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "u_id=" + u_id +
                ", u_name='" + u_name + '\'' +
                ", u_sex='" + u_sex + '\'' +
                ", u_age=" + u_age +
                ", u_password='" + u_password + '\'' +
                '}';
    }
}
