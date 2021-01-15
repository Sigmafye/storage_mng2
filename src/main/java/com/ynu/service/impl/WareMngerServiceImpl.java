package com.ynu.service.impl;

import com.ynu.mapper.WareMngerMapper;
import com.ynu.pojo.WareMnger;
import com.ynu.service.WareMngerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WareMngerServiceImpl implements WareMngerService {

    @Autowired
    WareMngerMapper wareMngerMapper;

    public WareMnger validate(WareMnger wareMnger) {
        return wareMngerMapper.validate(wareMnger);
    }

    /**
     * 获得库存管理员列表
     * @return
     */
    public List<WareMnger> getWareMngerList() {
        return wareMngerMapper.getWareMngerList();
    }

    /**
     * 搜索某个管理员
     * @param wareMnger
     * @return
     */
    public WareMnger search(WareMnger wareMnger) {
        return wareMngerMapper.search(wareMnger);
    }

    /**
     * 添加管理员
     * @param wareMnger
     * @return
     */
    public boolean add(WareMnger wareMnger) {
        return wareMngerMapper.add(wareMnger);
    }

    /**
     * 删除管理员
     * @param id
     * @return
     */
    public boolean delete(int id) {
        return wareMngerMapper.delete(id);
    }

    public boolean update(WareMnger wareMnger) {
        return wareMngerMapper.update(wareMnger);
    }
}
