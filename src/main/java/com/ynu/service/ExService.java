package com.ynu.service;

import com.ynu.pojo.Export;

import java.util.List;

public interface ExService {

    public Export getEX(int ex_id);  //获取特定出库记录

    public List<Export> getEXList();  //获取所有出库记录

    public void insertEX(Export export); //增添出库记录

    public void updateEX(Export export); //更新出库记录

    public void deleteEX(int ex_id); //删除出库记录

}
