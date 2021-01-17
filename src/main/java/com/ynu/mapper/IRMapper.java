package com.ynu.mapper;

import com.ynu.pojo.ImportRecord;
import com.ynu.pojo.Repertory;

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
    public boolean insertIR(ImportRecord importRecord);

    /**
     * 更新入库单记录
     * @param importRecord
     */
    public boolean updateIR(ImportRecord importRecord);

    /**
     * 根据入库单编号删除入库单记录
     * @param im_id
     */
    public boolean deleteIR(int im_id);

    public List<Repertory> getRepertoryList(Repertory repertory);


    public List<Repertory> getProductsRepertoryList();


    public List<Repertory> getGoodsRepertoryList();


}
