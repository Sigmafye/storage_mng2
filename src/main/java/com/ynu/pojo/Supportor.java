package com.ynu.pojo;


/**
 * 供应商实体类，supportor
 */
public class Supportor {
    private int s_id;//供应商编号
    private String s_name;//供应商名称
    private  String s_address;//供应商地址
    private String s_phone;//供应商电话

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_address() {
        return s_address;
    }

    public void setS_address(String s_address) {
        this.s_address = s_address;
    }

    public String getS_phone() {
        return s_phone;
    }

    public void setS_phone(String s_phone) {
        this.s_phone = s_phone;
    }

    @Override
    public String toString() {
        return "Supportor{" +
                "s_id=" + s_id +
                ", s_name='" + s_name + '\'' +
                ", s_address='" + s_address + '\'' +
                ", s_phone='" + s_phone + '\'' +
                '}';
    }
}
