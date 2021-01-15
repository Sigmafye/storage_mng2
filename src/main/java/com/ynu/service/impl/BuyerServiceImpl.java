package com.ynu.service.impl;

import com.ynu.mapper.BuyerMapper;
import com.ynu.pojo.Buyer;
import com.ynu.pojo.MyOrder;
import com.ynu.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
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

    public boolean deleteBuyerById(int u_id) {
        int isDelete= buyerMapper.deleteBuyerById(u_id);
        if (isDelete>0){
            return true;
        }else{
            return false;
        }
    }


    public Buyer getBuyerInfo(int u_id) {
        Buyer buyer=buyerMapper.getBuyerInfo(u_id);
        return buyer;
    }

    public boolean updateBuyerInfo(Buyer buyer) {
        int isUpdate=buyerMapper.updateBuyerInfo(buyer);
        if (isUpdate>0){
            return true;
        }else{
            return false;
        }

    }


    public List<Integer> getBuyerIdList() {
        List<Integer> buyerIdList=buyerMapper.getBuyerIdList();

        return buyerIdList;


    }

    public List<MyOrder> getBuyerOrderList(int u_id) {
        List<MyOrder> buyerOrderList=buyerMapper.getBuyerOrderList(u_id);
        return buyerOrderList;
    }
}
