package com.ynu.service;

import com.ynu.pojo.WareHouse;

public interface WareHouseService {

    public WareHouse getWareHouseList();

    public WareHouse search(WareHouse wareHouse);

    public boolean add(WareHouse wareHouse);

    public boolean delete(int id);

    public boolean update(WareHouse wareHouse);
}
