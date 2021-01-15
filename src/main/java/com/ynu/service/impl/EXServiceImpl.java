package com.ynu.service.impl;

import com.ynu.mapper.EXMapper;
import com.ynu.pojo.Export;
import com.ynu.service.ExService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EXServiceImpl implements ExService {

    @Autowired
    private EXMapper exMapper;

    /**
     * 根据出库单编号获取特定入库单记录
     * @param ex_id
     * @return
     */
    public Export getEX(int ex_id) { return exMapper.getEX(ex_id); }

    /**
     * 获取全部出库单记录
     * @return
     */
    public List<Export> getEXList() { return exMapper.getEXList(); }

    /**
     * 插入入库单记录
     * @param export
     */
    public void insertEX(Export export) {
        exMapper.insertEX(export);
    }

    /**
     * 更新出库单记录
     * @param export
     */
    public void updateEX(Export export) {
        exMapper.updateEX(export);
    }


    /**
     * 根据出库单编号删除出库单记录
     * @param ex_id
     */
    public void deleteEX(int ex_id) { exMapper.deleteEX(ex_id); }



}
