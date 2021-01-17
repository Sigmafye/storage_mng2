package com.ynu.service.impl;

import com.ynu.mapper.IRMapper;
import com.ynu.pojo.ImportRecord;
import com.ynu.pojo.Repertory;
import com.ynu.service.ImportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IRServiceImpl implements ImportService{

    @Autowired
    private IRMapper irMapper;

    /**
     * 根据入库单编号获取特定入库单记录
     * @param im_id
     * @return
     */
    public ImportRecord getIR(int im_id) { return irMapper.getIR(im_id); }

    /**
     * 获取全部入库单记录
     * @return
     */
    public List<ImportRecord> getIRList() { return irMapper.getIRList(); }

    /**
     * 插入入库单记录
     * @param importRecord
     */
    public boolean insertIR(ImportRecord importRecord) {
        irMapper.insertIR(importRecord);
        return false;
    }

    /**
     * 更新入库单记录
     * @param importRecord
     */
    public boolean updateIR(ImportRecord importRecord) {
        irMapper.updateIR(importRecord);
        return true;
    }


    /**
     * 根据入库单编号删除入库单记录
     * @param im_id
     */
    public boolean deleteIR(int im_id) { irMapper.deleteIR(im_id); return true;}

    public List<Repertory> getRepertoryList(Repertory repertory){
        return irMapper.getRepertoryList(repertory);
    }


    @Override
    public List<Repertory> getProductsRepertoryList() {
        System.out.println("yes");
        return irMapper.getProductsRepertoryList();
    }


    @Override
    public List<Repertory> getGoodsRepertoryList() {
        return irMapper.getGoodsRepertoryList();
    }
}
