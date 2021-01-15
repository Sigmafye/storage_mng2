package com.ynu.service;

import com.ynu.pojo.WareHouse;

import java.util.List;

public interface WareHouseService {

    public List<WareHouse> getWareHouseList();

    public List<Integer> getIdList();

    public WareHouse search(WareHouse wareHouse);

    public boolean add(WareHouse wareHouse);

    public boolean delete(int id);

    public boolean update(WareHouse wareHouse);
}
