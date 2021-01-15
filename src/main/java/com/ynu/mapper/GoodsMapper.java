package com.ynu.mapper;

import com.ynu.pojo.Goods;

import java.util.List;

public interface GoodsMapper {

    public List<Goods> getGoodsList();

    public Goods search(Goods goods);

    public boolean add(Goods goods);

    public boolean delete(int gs_id);

    public boolean update(Goods goods);
}
