package com.ynu.pojo;

public class ImportRecord {
    private int im_id;//入库单编号
    private int m_id;//货物编号
    private int c_id;//客户编号
    private double im_quantity;//入库数量
    private String im_time;//入库时间
    private String im_principal;//负责人
    private String im_remarks;//备注


    public ImportRecord(){
    }

    public ImportRecord(int im_id, int m_id, int c_id, double im_quantity, String im_time, String im_principal, String im_remarks) {
        this.im_id = im_id;
        this.m_id = m_id;
        this.c_id = c_id;
        this.im_quantity = im_quantity;
        this.im_time = im_time;
        this.im_principal = im_principal;
        this.im_remarks = im_remarks;
    }

    public int getIm_id() {
        return im_id;
    }

    public void setIm_id(int im_id) {
        this.im_id = im_id;
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

    public double getIm_quantity() {
        return im_quantity;
    }

    public void setIm_quantity(double im_quantity) {
        this.im_quantity = im_quantity;
    }

    public String getIm_time() {
        return im_time;
    }

    public void setIm_time(String im_time) {
        this.im_time = im_time;
    }

    public String getIm_principal() {
        return im_principal;
    }

    public void setIm_principal(String im_principal) {
        this.im_principal = im_principal;
    }

    public String getIm_remarks() {
        return im_remarks;
    }

    public void setIm_remarks(String im_remarks) {
        this.im_remarks = im_remarks;
    }

    @Override
    public String toString() {
        return "ImportRecord{" +
                "im_id=" + im_id +
                ", m_id=" + m_id +
                ", c_id=" + c_id +
                ", im_quantity=" + im_quantity +
                ", im_time='" + im_time + '\'' +
                ", im_principal='" + im_principal + '\'' +
                ", im_remarks='" + im_remarks + '\'' +
                '}';
    }
}
