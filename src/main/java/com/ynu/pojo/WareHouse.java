package com.ynu.pojo;

/*
仓库
 */
public class WareHouse {
    private int w_id; //仓库编号
    private int m_id;   //管理员编号
    private String w_name;  //仓库名称
    private String w_addr;  //仓库地址
    private int w_capacity;  //仓库容量
    private int w_surplus;  //仓库余量

    public WareHouse() {
    }

    public WareHouse(int w_id, int m_id, String w_name, String w_addr, int w_capacity, int w_surplus) {
        this.w_id = w_id;
        this.m_id = m_id;
        this.w_name = w_name;
        this.w_addr = w_addr;
        this.w_capacity = w_capacity;
        this.w_surplus = w_surplus;
    }

    public WareHouse(int m_id, String w_name, String w_addr, int w_capacity, int w_surplus) {
        this.m_id = m_id;
        this.w_name = w_name;
        this.w_addr = w_addr;
        this.w_capacity = w_capacity;
        this.w_surplus = w_surplus;
    }

    public WareHouse(int w_id) {
        this.w_id = w_id;
    }

    @Override
    public String toString() {
        return "WareHouse{" +
                "w_no=" + w_id +
                ", m_id=" + m_id +
                ", w_name='" + w_name + '\'' +
                ", w_addr='" + w_addr + '\'' +
                ", w_capacity=" + w_capacity +
                ", w_surplus=" + w_surplus +
                '}';
    }

    public int getW_id() {
        return w_id;
    }

    public void setW_id(int w_id) {
        this.w_id = w_id;
    }

    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }

    public String getW_name() {
        return w_name;
    }

    public void setW_name(String w_name) {
        this.w_name = w_name;
    }

    public String getW_addr() {
        return w_addr;
    }

    public void setW_addr(String w_addr) {
        this.w_addr = w_addr;
    }

    public int getW_capacity() {
        return w_capacity;
    }

    public void setW_capacity(int w_capacity) {
        this.w_capacity = w_capacity;
    }

    public int getW_surplus() {
        return w_surplus;
    }

    public void setW_surplus(int w_surplus) {
        this.w_surplus = w_surplus;
    }
}
