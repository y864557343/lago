package com.yjn.lago.service;

import com.yjn.lago.pojo.Category;
import com.yjn.lago.pojo.Product;

import java.util.List;

public interface ProductService {
    void add(Product p);
    void delete(int id);
    void update(Product p);
    Product get(int id);
    List list(int cid);
    void setFirstProductImage(Product p);

    void stuff(List<Category> cs);

    void stuff(Category c);

    void stuffByRow(List<Category> cs);

    void setInfo(Product p);

    void setInfos(List<Product> ps);

    List<Product> findList(String keyword);
}

