package com.ynu.service.impl;

import com.ynu.mapper.SupportorMapper;
import com.ynu.pojo.Supportor;
import com.ynu.service.SupportorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
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

    public boolean deleteSupportor(int s_id){
        int isDelete= supportorMapper.deleteSupportor(s_id);
        if(isDelete>0){
            return true;
        }else{
            return false;
        }

    }

    public Supportor getSupportor(int s_id) {
        Supportor supportor=supportorMapper.getSupportor(s_id);
        return supportor;
    }

    public boolean updateSupportor(Supportor supportor) {
        int isUpdate=supportorMapper.updateSupportor(supportor);
        if(isUpdate>0){
            return true;
        }else{
            return false;
        }
    }
}
