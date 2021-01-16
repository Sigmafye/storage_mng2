package com.ynu.mapper;

import com.ynu.pojo.Buyer;
import com.ynu.pojo.MyOrder;

import java.util.List;

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

    /**
     * 返回采购员的编号列表
     * @return
     */
    public List<Integer> getBuyerIdList();

    /**
     * 返回采购员列表
     * @return
     */
    public List<Buyer> getBuyerList();


    /**
     * 根据采购员编号查找对应的订单
     * @return
     */
    public List<MyOrder> getBuyerOrderList(int u_id);


    /**
     * 采购员登录验证
     * @param buyer
     * @return
     */
    public Buyer isValidBuyer(Buyer buyer);

}
