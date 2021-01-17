package com.ynu.pojo;

public class SuperMnger {

    private int su_id;  //超级管理员

    private String su_name; //姓名

    private String su_password; //密码

    private int su_age; //年龄

    private String su_addr; //地址

    public SuperMnger() {
    }

    public SuperMnger(String su_name, String su_password) {
        this.su_name = su_name;
        this.su_password = su_password;
    }

    public SuperMnger(String su_name, String su_password, int su_age, String su_addr) {
        this.su_name = su_name;
        this.su_password = su_password;
        this.su_age = su_age;
        this.su_addr = su_addr;
    }

    public SuperMnger(int su_id, String su_name, String su_password, int su_age, String su_addr) {
        this.su_id = su_id;
        this.su_name = su_name;
        this.su_password = su_password;
        this.su_age = su_age;
        this.su_addr = su_addr;
    }

    @Override
    public String toString() {
        return "SuperMnger{" +
                "su_id=" + su_id +
                ", su_name='" + su_name + '\'' +
                ", su_password='" + su_password + '\'' +
                ", su_age=" + su_age +
                ", su_addr='" + su_addr + '\'' +
                '}';
    }

    public int getSu_id() {
        return su_id;
    }

    public void setSu_id(int su_id) {
        this.su_id = su_id;
    }

    public String getSu_name() {
        return su_name;
    }

    public void setSu_name(String su_name) {
        this.su_name = su_name;
    }

    public String getSu_password() {
        return su_password;
    }

    public void setSu_password(String su_password) {
        this.su_password = su_password;
    }

    public int getSu_age() {
        return su_age;
    }

    public void setSu_age(int su_age) {
        this.su_age = su_age;
    }

    public String getSu_addr() {
        return su_addr;
    }

    public void setSu_addr(String su_addr) {
        this.su_addr = su_addr;
    }
}
