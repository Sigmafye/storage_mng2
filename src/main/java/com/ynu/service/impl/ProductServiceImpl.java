package com.ynu.service.impl;

import com.ynu.mapper.ProductMapper;
import com.ynu.pojo.Product;
import com.ynu.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    public List<Product> getProductList() {
        return productMapper.getProductList();
    }

    /**
     * 获得产品id列表
     * @return
     */
    public List<Integer> getIdList(){
        return productMapper.getIdList();
    }

    public Product search(Product product) {
        return productMapper.search(product);
    }

    public boolean add(Product product) {
        return productMapper.add(product);
    }

    public boolean delete(int id) {
        return productMapper.delete(id);
    }

    public boolean update(Product product) {
        return productMapper.update(product);
    }

    public List<Product> searchByName(String p_name) {
        return productMapper.searchByName(p_name);
    }
}
