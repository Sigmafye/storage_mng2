package com.ynu.pojo;

public class Goods {
    private int gs_id;  //商品编号
    private int ex_id;  //出库编号
    private int w_id;   //仓库编号
    private int im_id;  //入库编号
    private String gs_name; //商品名称
    private float gs_price; //商品价格
    private String gs_class;    //商品分类
    private int gs_num;     //数量
    private int gs_ware;    //所在仓库
    private int gs_shelf;   //所在货架

    @Override
    public String toString() {
        return "Goods{" +
                "gs_id=" + gs_id +
                ", ex_id=" + ex_id +
                ", w_id=" + w_id +
                ", im_id=" + im_id +
                ", gs_name='" + gs_name + '\'' +
                ", gs_price=" + gs_price +
                ", gs_class='" + gs_class + '\'' +
                ", gs_num=" + gs_num +
                ", gs_ware=" + gs_ware +
                ", gs_shelf=" + gs_shelf +
                '}';
    }

    public int getGs_id() {
        return gs_id;
    }

    public void setGs_id(int gs_id) {
        this.gs_id = gs_id;
    }

    public int getEx_id() {
        return ex_id;
    }

    public void setEx_id(int ex_id) {
        this.ex_id = ex_id;
    }

    public int getW_id() {
        return w_id;
    }

    public void setW_id(int w_id) {
        this.w_id = w_id;
    }

    public int getIm_id() {
        return im_id;
    }

    public void setIm_id(int im_id) {
        this.im_id = im_id;
    }

    public String getGs_name() {
        return gs_name;
    }

    public void setGs_name(String gs_name) {
        this.gs_name = gs_name;
    }

    public float getGs_price() {
        return gs_price;
    }

    public void setGs_price(float gs_price) {
        this.gs_price = gs_price;
    }

    public String getGs_class() {
        return gs_class;
    }

    public void setGs_class(String gs_class) {
        this.gs_class = gs_class;
    }

    public int getGs_num() {
        return gs_num;
    }

    public void setGs_num(int gs_num) {
        this.gs_num = gs_num;
    }

    public int getGs_ware() {
        return gs_ware;
    }

    public void setGs_ware(int gs_ware) {
        this.gs_ware = gs_ware;
    }

    public int getGs_shelf() {
        return gs_shelf;
    }

    public void setGs_shelf(int gs_shelf) {
        this.gs_shelf = gs_shelf;
    }
}
