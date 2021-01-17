package com.ynu.mapper;

import com.ynu.pojo.Export;

import java.util.List;

public interface EXMapper {
    /**
     * 根据出库单编号获取特定出库单记录
     * @param ex_id
     * @return
     */
    public Export getEX(int ex_id);

    /**
     * 获取全部出库单记录
     * @return
     */
    public List<Export> getEXList();

    /**
     * 插入出库单记录
     * @param export
     */
    public boolean insertEX(Export export);

    /**
     * 更新出库单记录
     * @param export
     */
    public boolean updateEX(Export export);

    /**
     * 根据入=出库单编号删除出库单记录
     * @param ex_id
     */
    public boolean deleteEX(int ex_id);
}
