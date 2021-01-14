package com.ynu.service;

import com.ynu.pojo.Product;

public interface ProductService {

    public Product getProductList();

    public Product search(Product goods);

    public boolean add(Product goods);

    public boolean delete(int id);

    public boolean update(Product goods);
}
