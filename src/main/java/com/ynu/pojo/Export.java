package com.ynu.pojo;

public class Export {
    private int ex_id;//出库单编号
    private int m_id;//货物编号
    private int c_id;//客户编号
    private double ex_quantity;//出库数量
    private String ex_time;//出库时间
    private String ex_principal;//负责人
    private String ex_remarks;//备注

    public  Export(){

    }

    public Export(int ex_id, int m_id, int c_id, double ex_quantity, String ex_time, String ex_principal, String ex_remarks) {
        this.ex_id = ex_id;
        this.m_id = m_id;
        this.c_id = c_id;
        this.ex_quantity = ex_quantity;
        this.ex_time = ex_time;
        this.ex_principal = ex_principal;
        this.ex_remarks = ex_remarks;
    }

    public int getEx_id() {
        return ex_id;
    }

    public void setEx_id(int ex_id) {
        this.ex_id = ex_id;
    }

    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public double getEx_quantity() {
        return ex_quantity;
    }

    public void setEx_quantity(double ex_quantity) {
        this.ex_quantity = ex_quantity;
    }

    public String getEx_time() {
        return ex_time;
    }

    public void setEx_time(String ex_time) {
        this.ex_time = ex_time;
    }

    public String getEx_principal() {
        return ex_principal;
    }

    public void setEx_principal(String ex_principal) {
        this.ex_principal = ex_principal;
    }

    public String getEx_remarks() {
        return ex_remarks;
    }

    public void setEx_remarks(String ex_remarks) {
        this.ex_remarks = ex_remarks;
    }

    @Override
    public String toString() {
        return "Export{" +
                "ex_id=" + ex_id +
                ", m_id=" + m_id +
                ", c_id=" + c_id +
                ", ex_quantity=" + ex_quantity +
                ", ex_time='" + ex_time + '\'' +
                ", ex_principal='" + ex_principal + '\'' +
                ", ex_remarks='" + ex_remarks + '\'' +
                '}';
    }
}
