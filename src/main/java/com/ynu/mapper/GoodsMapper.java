package com.ynu.mapper;

import com.ynu.pojo.Goods;

public interface GoodsMapper {

    public Goods getGoodsList();

    public Goods search(Goods goods);

    public boolean add(Goods goods);

    public boolean delete(int gs_id);

    public boolean update(Goods goods);
}
