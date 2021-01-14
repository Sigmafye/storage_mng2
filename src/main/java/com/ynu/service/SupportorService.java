package com.ynu.service;

import com.ynu.pojo.Supportor;

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
}
