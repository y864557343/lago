package com.yjn.lago.service.impl;

import com.yjn.lago.mapper.PropertyMapper;
import com.yjn.lago.pojo.Property;
import com.yjn.lago.pojo.PropertyExample;
import com.yjn.lago.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PropertyServiceImpl implements PropertyService {
    @Autowired
    PropertyMapper propertyMapper;

    @Override
    public void add(Property p) {
        propertyMapper.insert(p);
    }

    @Override
    public void delete(int id) {
        propertyMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Property p) {
        propertyMapper.updateByPrimaryKeySelective(p);
    }

    @Override
    public Property get(int id) {
        return propertyMapper.selectByPrimaryKey(id);
    }

    @Override
    public List list(int cid) {
        PropertyExample example =new PropertyExample();
        example.createCriteria().andCidEqualTo(cid);
        example.setOrderByClause("id desc");
        return propertyMapper.selectByExample(example);
    }



}

