package com.ynu.service;

import com.ynu.pojo.Goods;

public interface GoodsService {

    public Goods getGoodsList();

    public Goods search(Goods goods);

    public boolean add(Goods goods);

    public boolean delete(int id);

    public boolean update(Goods goods);

}
