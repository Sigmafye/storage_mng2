package com.ynu.service.impl;

import com.ynu.mapper.BuyerMapper;
import com.ynu.pojo.Buyer;
import com.ynu.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;

public class BuyerServiceImpl implements BuyerService {


    @Autowired
    private BuyerMapper buyerMapper;


    public boolean addBuyerById(Buyer buyer){
        int isAdd=buyerMapper.addBuyerById(buyer);
        if (isAdd>0){
            return true;
        }else{
            return false;
        }
    }
}
