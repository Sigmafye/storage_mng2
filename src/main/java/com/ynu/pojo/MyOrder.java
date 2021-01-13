package com.ynu.pojo;


/**
 * 订单信息实体
 */
public class MyOrder {


    private int bl_id;//订单编号

    private int s_id;//供应商编号

    private int u_id;//采购员编号

    private  String supportor;//供应商
    private int ware;//收货仓库
    private String a_time;//到货时间
    private String relate_peo;//联系人
    private String re_methods;//联系方式
    private int p_id;//经手人编号
    private String processor;//经手人

    public int getBl_id() {
        return bl_id;
    }

    public void setBl_id(int bl_id) {
        this.bl_id = bl_id;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getSupportor() {
        return supportor;
    }

    public void setSupportor(String supportor) {
        this.supportor = supportor;
    }

    public int getWare() {
        return ware;
    }

    public void setWare(int ware) {
        this.ware = ware;
    }

    public String getA_time() {
        return a_time;
    }

    public void setA_time(String a_time) {
        this.a_time = a_time;
    }

    public String getRelate_peo() {
        return relate_peo;
    }

    public void setRelate_peo(String relate_peo) {
        this.relate_peo = relate_peo;
    }

    public String getRe_methods() {
        return re_methods;
    }

    public void setRe_methods(String re_methods) {
        this.re_methods = re_methods;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "MyOrder{" +
                "bl_id=" + bl_id +
                ", s_id=" + s_id +
                ", u_id='" + u_id + '\'' +
                ", supportor='" + supportor + '\'' +
                ", ware=" + ware +
                ", a_time='" + a_time + '\'' +
                ", relate_peo='" + relate_peo + '\'' +
                ", re_methods='" + re_methods + '\'' +
                ", p_id=" + p_id +
                ", processor='" + processor + '\'' +
                '}';
    }
}
