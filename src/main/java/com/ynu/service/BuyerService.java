package com.ynu.service;

import com.ynu.pojo.Buyer;

public interface BuyerService {


    /**
     * 根据采购员编号增加采购员
     * @param buyer
     * @return
     */
    public boolean addBuyerById(Buyer buyer);
}
