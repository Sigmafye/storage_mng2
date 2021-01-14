package com.ynu.service.impl;

import com.ynu.mapper.SupportorMapper;
import com.ynu.pojo.Supportor;
import com.ynu.service.SupportorService;
import org.springframework.beans.factory.annotation.Autowired;

public class SupportorServiceImpl implements SupportorService {


    @Autowired
    private SupportorMapper supportorMapper;



    public boolean addSupportor(Supportor supportor){
        int isAdd=supportorMapper.addSupportor(supportor);
        if(isAdd>0){
            return true;
        }else{
            return false;
        }
    }



}
