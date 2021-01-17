package com.ynu.service;

import com.ynu.pojo.Product;

import java.util.List;

public interface ProductService {

    public List<Product> getProductList();

    public List<Integer> getIdList();

    public Product search(Product goods);

    public boolean add(Product goods);

    public boolean delete(int id);

    public boolean update(Product goods);


    public List<Product> searchByName(String p_name);
}
