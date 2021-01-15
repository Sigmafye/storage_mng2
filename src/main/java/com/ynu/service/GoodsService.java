package com.ynu.service;

import com.ynu.pojo.Goods;

import java.util.List;

public interface GoodsService {

    public List<Goods> getGoodsList();

    public Goods search(Goods goods);

    public boolean add(Goods goods);

    public boolean delete(int id);

    public boolean update(Goods goods);

}
