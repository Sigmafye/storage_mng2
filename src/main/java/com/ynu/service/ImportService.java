package com.ynu.service;

import com.ynu.pojo.ImportRecord;
import com.ynu.pojo.Repertory;


import java.util.List;


public interface ImportService {
    public ImportRecord getIR(int im_id);  //获取特定入库记录

    public List<ImportRecord> getIRList();  //获取所有入库记录

    public boolean insertIR(ImportRecord importRecord); //增添入库记录

    public boolean updateIR(ImportRecord importRecord); //更新入库记录

    public boolean deleteIR(int im_id); //删除入库记录

    public List<Repertory> getRepertoryList(Repertory repertory);  //获取所有库存记录

    public List<Repertory> getProductsRepertoryList();

    public List<Repertory> getGoodsRepertoryList();

}
