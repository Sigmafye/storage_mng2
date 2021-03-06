package com.ynu.service.impl;

import com.ynu.mapper.GoodsMapper;
import com.ynu.pojo.Goods;
import com.ynu.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    /**
     * 获得商品列表
     * @return 列表
     */
    public List<Goods> getGoodsList() {
        return goodsMapper.getGoodsList();
    }

    /**
     * 获得商品id列表
     * @return
     */
    public List<Integer> getIdList(){
        return goodsMapper.getIdList();
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


    /**
     * 根据商品类别查找
     * @param gs_class
     * @return
     */
    public List<Goods> goodsSearch(String gs_class) {

        return goodsMapper.goodsSearch(gs_class);
    }
}
