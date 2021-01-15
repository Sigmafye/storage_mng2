package com.ynu.mapper;

import com.ynu.pojo.ImportRecord;

import java.util.List;

public interface IRMapper {

    /**
     * 根据入库单编号获取特定入库单记录
     * @param im_id
     * @return
     */
    public ImportRecord getIR(int im_id);

    /**
     * 获取全部入库单记录
     * @return
     */
    public List<ImportRecord> getIRList();

    /**
     * 插入入库单记录
     * @param importRecord
     */
    public void insertIR(ImportRecord importRecord);

    /**
     * 更新入库单记录
     * @param importRecord
     */
    public void updateIR(ImportRecord importRecord);

    /**
     * 根据入库单编号删除入库单记录
     * @param im_id
     */
    public void deleteIR(int im_id);
}
