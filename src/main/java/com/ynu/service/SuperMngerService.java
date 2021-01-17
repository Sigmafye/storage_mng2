package com.ynu.service;

import com.ynu.pojo.SuperMnger;

import java.util.List;

public interface SuperMngerService {

    public List<SuperMnger> getSuperList();

    public SuperMnger search(int id);

    public SuperMnger validate(SuperMnger superMnger);

    public boolean add(SuperMnger superMnger);

    public boolean delete(int id);

    public boolean update(SuperMnger superMnger);

    public List<SuperMnger> searchByName(String name);

}
