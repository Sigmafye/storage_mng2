package com.ynu.pojo;


/**
 * 订单商品实体,gds_tobuy
 */
public class OrderGoods {
    private int g_id;//采购商品编号
    private int bl_id;//订单编号
    private String g_name;//采购商品名称
    private String g_clacc;//采购商品分类
    private int g_num;//采购商品数量
    private double g_price;//采购单价

    public int getG_id() {
        return g_id;
    }

    public void setG_id(int g_id) {
        this.g_id = g_id;
    }

    public int getBl_id() {
        return bl_id;
    }

    public void setBl_id(int bl_id) {
        this.bl_id = bl_id;
    }

    public String getG_name() {
        return g_name;
    }

    public void setG_name(String g_name) {
        this.g_name = g_name;
    }

    public String getG_clacc() {
        return g_clacc;
    }

    public void setG_clacc(String g_clacc) {
        this.g_clacc = g_clacc;
    }

    public int getG_num() {
        return g_num;
    }

    public void setG_num(int g_num) {
        this.g_num = g_num;
    }

    public double getG_price() {
        return g_price;
    }

    public void setG_price(double g_price) {
        this.g_price = g_price;
    }

    @Override
    public String toString() {
        return "OrderGoods{" +
                "g_id=" + g_id +
                ", bl_id=" + bl_id +
                ", g_name='" + g_name + '\'' +
                ", g_clacc='" + g_clacc + '\'' +
                ", g_num=" + g_num +
                ", g_price=" + g_price +
                '}';
    }
}
