package com.ynu.service;

import com.ynu.pojo.ImportRecord;


import java.util.List;


public interface ImportService {
    public ImportRecord getIR(int im_id);  //获取特定入库记录

    public List<ImportRecord> getIRList();  //获取所有入库记录

    public boolean insertIR(ImportRecord importRecord); //增添入库记录

    public void updateIR(ImportRecord importRecord); //更新入库记录

    public void deleteIR(int im_id); //删除入库记录



}
