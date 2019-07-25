package com.newer.demo3.service;

import com.newer.demo3.domain.Upload;
import com.newer.demo3.domain.Users;
import com.newer.demo3.mapper.UploadMapper;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
public class UploadService {
    @Autowired
    private UploadMapper uploadMapper;

    public List<Upload> selAll(){
        return uploadMapper.selAll();
    }

    //登录
    public Users longin(Users users){
        return uploadMapper.longin(users);
    }


    //注册
    public int register(Users users){
        return uploadMapper.register(users);
    }
}
