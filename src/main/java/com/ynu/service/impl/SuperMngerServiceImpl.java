package com.ynu.service.impl;

import com.ynu.mapper.SuperMngerMapper;
import com.ynu.pojo.SuperMnger;
import com.ynu.service.SuperMngerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SuperMngerServiceImpl implements SuperMngerService {

    @Autowired
    SuperMngerMapper superMngerMapper;

    public List<SuperMnger> getSuperList() {
        return superMngerMapper.getSuperList();
    }

    public SuperMnger search(int id) {
        return superMngerMapper.search(id);
    }

    public SuperMnger validate(SuperMnger superMnger){
        return superMngerMapper.validate(superMnger);
    }

    public boolean add(SuperMnger superMnger) {
        return superMngerMapper.add(superMnger);
    }

    public boolean delete(int id) {
        return superMngerMapper.delete(id);
    }

    public boolean update(SuperMnger superMnger) {
        return superMngerMapper.update(superMnger);
    }
}
