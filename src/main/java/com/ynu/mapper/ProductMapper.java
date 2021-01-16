package com.ynu.mapper;

import com.ynu.pojo.Product;

import java.util.List;

public interface ProductMapper {

    public List<Product> getProductList();

    public List<Integer> getIdList();

    public Product search(Product product);

    public boolean add(Product product);

    public boolean delete(int p_idd);

    public boolean update(Product product);
}
