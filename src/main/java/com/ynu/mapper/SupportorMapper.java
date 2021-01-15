package com.ynu.mapper;

import com.ynu.pojo.Supportor;

public interface SupportorMapper {


    /**
     * 增加供应商
     * @param supportor
     * @return
     */
    public int addSupportor(Supportor supportor);


    /**
     * 根据供应商编号删除供应商
     * @param s_id
     * @return
     */
    public int deleteSupportor(int s_id);

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
    public int updateSupportor(Supportor supportor);

}
