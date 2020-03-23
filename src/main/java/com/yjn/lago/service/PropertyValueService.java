package com.yjn.lago.service;

import com.yjn.lago.pojo.Product;
import com.yjn.lago.pojo.PropertyValue;

import java.util.List;

public interface PropertyValueService {
    void init(Product p);
    void update(PropertyValue pv);

    PropertyValue get(int ptid, int pid);
    List<PropertyValue> list(int pid);
}


