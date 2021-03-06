package com.ynu.service;

import com.ynu.pojo.Goods;
import org.w3c.dom.ls.LSException;

import java.util.List;

public interface GoodsService {

    public List<Goods> getGoodsList();

    public List<Integer> getIdList();

    public Goods search(Goods goods);

    public boolean add(Goods goods);

    public boolean delete(int id);

    public boolean update(Goods goods);

    public List<Goods> goodsSearch(String gs_class);
}
