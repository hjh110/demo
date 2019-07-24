package com.newer.demo3.service;

import com.newer.demo3.domain.Upload;
import com.newer.demo3.domain.Users;
import com.newer.demo3.mapper.UploadMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UploadService {
    @Autowired
    private UploadMapper uploadMapper;

    public List<Upload> selAll(){
        return uploadMapper.selAll();
    }

    //登录
    public Users longin(String username, String pwd){
        return uploadMapper.longin(username,pwd);
    }
    //注册
    public int register(Users users){
        return uploadMapper.register(users);
    }
}
