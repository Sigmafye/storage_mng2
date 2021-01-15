package com.ynu.service;

import com.ynu.pojo.MyOrder;
import com.ynu.pojo.Supportor;

import java.util.List;

public interface SupportorService {


    /**
     * 增加供应商
     * @param supportor
     * @return
     */
    public boolean addSupportor(Supportor supportor);


    /**
     * 根据供应商编号删除供应商
     * @param s_id
     * @return
     */
    public boolean deleteSupportor(int s_id);


    /**
     * 根据供应商id查找供应商
     * @param s_id
     * @return
     */
    public Supportor getSupportor(int s_id);


    /**
     * 更新供应商信息
     * @param supportor
     * @return
     */
    public boolean updateSupportor(Supportor supportor);



    /**
     * 返回所有供应商信息
     * @return
     */
    public List<Supportor> getSupportorList();


    /**
     * 根据供应商编号返回所有相关订单信息
     * @param s_id
     * @return
     */
    public List<MyOrder> getSupportorOrderList(int s_id);

    /**
     * 获取所有供应商编号列表
     * @return
     */
    public List<Integer> getSupportorIdList();
}
