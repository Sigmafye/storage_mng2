package com.ynu.service.impl;

import com.ynu.mapper.WareHouseMapper;
import com.ynu.pojo.WareHouse;
import com.ynu.service.WareHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WareHouseServiceImpl implements WareHouseService {

    @Autowired
    WareHouseMapper wareHouseMapper;

    /**
     * 获得仓库列表
     * @return
     */
    public WareHouse getWareHouseList() {
        return wareHouseMapper.getWareHouseList();
    }

    /**
     * 搜索某个仓库
     * @param wareHouse
     * @return
     */
    public WareHouse search(WareHouse wareHouse) {
        return wareHouseMapper.search(wareHouse);
    }

    /**
     * 添加仓库
     * @param wareHouse
     * @return
     */
    public boolean add(WareHouse wareHouse) {
        return wareHouseMapper.add(wareHouse);
    }

    /**
     * 删除仓库
     * @param id
     * @return
     */
    public boolean delete(int id) {
        return wareHouseMapper.delete(id);
    }

    /**
     * 更新仓库
     * @param wareHouse
     * @return
     */
    public boolean update(WareHouse wareHouse) {
        return wareHouseMapper.update(wareHouse);
    }
}
