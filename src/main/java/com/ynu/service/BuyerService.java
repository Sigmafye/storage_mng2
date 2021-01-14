package com.ynu.service;

import com.ynu.pojo.Buyer;

public interface BuyerService {


    /**
     * 根据采购员编号增加采购员
     * @param buyer
     * @return
     */
    public boolean addBuyerById(Buyer buyer);


    /**
     * 根据采购员id删除采购员
     * @param u_id
     * @return
     */
    public boolean deleteBuyerById(int u_id);


    /**
     * 更新采购员信息
     * @param buyer
     * @return
     */
    public boolean updateBuyerInfo(Buyer buyer);


    /**
     *根据采购员id返回采购员信息
     * @param u_id
     * @return Buyer
     */
    public Buyer getBuyerInfo(int u_id);
}
