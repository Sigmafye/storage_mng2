package com.ynu.pojo;

/***
 * 产品
 */
public class Product {
    private int p_idd;  //产品编号
    private int w_id;   //仓库编号
    private String p_warehouse;  //所在仓库
    private int im_id;  //入库编号
    private int ex_id;  //出库编号
    private String p_name;  //产品名称
    private float p_price; //产品单价
    private int p_quantity; //库存数量
    private String p_type;  //产品类别
    private int p_shelf_number;   //货架号

    public Product() {
    }

    public Product(int p_idd) {
        this.p_idd = p_idd;
    }

    public Product(int w_id, String p_warehouse, int im_id, int ex_id, String p_name, float p_price, int p_quantity, String p_type, int p_shelf_number) {
        this.w_id = w_id;
        this.p_warehouse = p_warehouse;
        this.im_id = im_id;
        this.ex_id = ex_id;
        this.p_name = p_name;
        this.p_price = p_price;
        this.p_quantity = p_quantity;
        this.p_type = p_type;
        this.p_shelf_number = p_shelf_number;
    }

    public Product(int p_idd, int w_id, String p_warehouse, int im_id, int ex_id, String p_name, float p_price, int p_quantity, String p_type, int p_shelf_number) {
        this.p_idd = p_idd;
        this.w_id = w_id;
        this.p_warehouse = p_warehouse;
        this.im_id = im_id;
        this.ex_id = ex_id;
        this.p_name = p_name;
        this.p_price = p_price;
        this.p_quantity = p_quantity;
        this.p_type = p_type;
        this.p_shelf_number = p_shelf_number;
    }

    @Override
    public String toString() {
        return "Product{" +
                "p_idd=" + p_idd +
                ", w_id=" + w_id +
                ", p_warehouse='" + p_warehouse + '\'' +
                ", im_id=" + im_id +
                ", ex_id=" + ex_id +
                ", p_name='" + p_name + '\'' +
                ", p_price=" + p_price +
                ", p_quantity=" + p_quantity +
                ", p_type='" + p_type + '\'' +
                ", p_shelf_number=" + p_shelf_number +
                '}';
    }

    public int getP_idd() {
        return p_idd;
    }

    public void setP_idd(int p_idd) {
        this.p_idd = p_idd;
    }

    public int getW_id() {
        return w_id;
    }

    public void setW_id(int w_id) {
        this.w_id = w_id;
    }

    public String getP_warehouse() {
        return p_warehouse;
    }

    public void setP_warehouse(String p_warehouse) {
        this.p_warehouse = p_warehouse;
    }

    public int getIm_id() {
        return im_id;
    }

    public void setIm_id(int im_id) {
        this.im_id = im_id;
    }

    public int getEx_id() {
        return ex_id;
    }

    public void setEx_id(int ex_id) {
        this.ex_id = ex_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public float getP_price() {
        return p_price;
    }

    public void setP_price(float p_price) {
        this.p_price = p_price;
    }

    public int getP_quantity() {
        return p_quantity;
    }

    public void setP_quantity(int p_quantity) {
        this.p_quantity = p_quantity;
    }

    public String getP_type() {
        return p_type;
    }

    public void setP_type(String p_type) {
        this.p_type = p_type;
    }

    public int getP_shelf_number() {
        return p_shelf_number;
    }

    public void setP_shelf_number(int p_shelf_number) {
        this.p_shelf_number = p_shelf_number;
    }
}
