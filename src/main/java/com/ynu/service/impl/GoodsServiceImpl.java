package com.ynu.service.impl;

import com.ynu.mapper.GoodsMapper;
import com.ynu.pojo.Goods;
import com.ynu.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    /**
     * 获得商品列表
     * @return 列表
     */
    public Goods getGoodsList() {
        return goodsMapper.getGoodsList();
    }

    /**
     * 查找某商品
     * @param goods 商品
     * @return 返回该商品
     */
    public Goods search(Goods goods) {
        return goodsMapper.search(goods);
    }

    /**
     * 添加某个商品
     * @param goods 商品
     * @return 是否成功
     */
    public boolean add(Goods goods) {
        return goodsMapper.add(goods);
    }

    /**
     * 删除某个商品
     * @param id 商品id
     * @return 是否成功
     */
    public boolean delete(int id) {
        return goodsMapper.delete(id);
    }

    /**
     * 更新某个商品
     * @param goods 商品
     * @return 是否成功
     */
    public boolean update(Goods goods) {
        return goodsMapper.update(goods);
    }
}
