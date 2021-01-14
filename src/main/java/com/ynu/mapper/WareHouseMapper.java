package com.ynu.mapper;

import com.ynu.pojo.WareHouse;

import java.util.List;

public interface WareHouseMapper {

    public List<WareHouse> getWareHouseList();

    public WareHouse search(WareHouse wareHouse);

    public boolean add(WareHouse wareHouse);

    public boolean delete(int w_id);

    public boolean update(WareHouse wareHouse);
}
