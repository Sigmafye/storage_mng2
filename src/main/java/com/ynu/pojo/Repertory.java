package com.ynu.pojo;

public class Repertory {

    public int r_id;
    public String r_name;
    public String r_type;
    public float r_price;
    public int r_quantity;
    public String r_warehouse;
    public String r_shelf;

    public Repertory(){

    }

    public Repertory(String r_name) {
        this.r_name = r_name;
    }

    public Repertory(int r_id, String r_name, String r_type, float r_price, int r_quantity, String r_warehouse, String r_shelf) {
        this.r_id = r_id;
        this.r_name = r_name;
        this.r_type = r_type;
        this.r_price = r_price;
        this.r_quantity = r_quantity;
        this.r_warehouse = r_warehouse;
        this.r_shelf = r_shelf;
    }

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    public String getR_name() {
        return r_name;
    }

    public void setR_name(String r_name) {
        this.r_name = r_name;
    }

    public String getR_type() {
        return r_type;
    }

    public void setR_type(String r_type) {
        this.r_type = r_type;
    }

    public float getR_price() {
        return r_price;
    }

    public void setR_price(float r_price) {
        this.r_price = r_price;
    }

    public int getR_quantity() {
        return r_quantity;
    }

    public void setR_quantity(int r_quantity) {
        this.r_quantity = r_quantity;
    }

    public String getR_warehouse() {
        return r_warehouse;
    }

    public void setR_warehouse(String r_warehouse) {
        this.r_warehouse = r_warehouse;
    }

    public String getR_shelf() {
        return r_shelf;
    }

    public void setR_shelf(String r_shelf) {
        this.r_shelf = r_shelf;
    }

    @Override
    public String toString() {
        return "Repertory{" +
                "r_id=" + r_id +
                ", r_name='" + r_name + '\'' +
                ", r_type='" + r_type + '\'' +
                ", r_price=" + r_price +
                ", r_quantity=" + r_quantity +
                ", r_warehouse='" + r_warehouse + '\'' +
                ", r_shelf='" + r_shelf + '\'' +
                '}';
    }
}
