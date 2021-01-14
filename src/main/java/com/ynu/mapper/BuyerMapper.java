package com.ynu.mapper;

import com.ynu.pojo.Buyer;

public interface BuyerMapper {


    /**
     * 增加采购员
     * @param buyer
     * @return
     */
    public int addBuyerById(Buyer buyer);


    /**
     * 根据采购员id删除采购员
     * @param u_id
     * @return int
     */
    public int deleteBuyerById(int u_id);


    /**
     * 更新采购员信息
     * @param buyer
     * @return int
     */
    public int updateBuyerInfo(Buyer buyer);


    /**
     *根据采购员id返回采购员信息
     * @param u_id
     * @return Buyer
     */
    public Buyer getBuyerInfo(int u_id);



}
