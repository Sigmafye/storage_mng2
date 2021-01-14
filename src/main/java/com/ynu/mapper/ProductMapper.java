package com.ynu.mapper;

import com.ynu.pojo.Product;

public interface ProductMapper {

    public Product getProductList();

    public Product search(Product product);

    public boolean add(Product product);

    public boolean delete(int p_idd);

    public boolean update(Product product);
}
