package com.newer.demo3.service;

import com.newer.demo3.domain.Attention;
import com.newer.demo3.domain.Upload;
import com.newer.demo3.mapper.UploadMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
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
    //推荐方案1 先查出用户关注的人的作品和关注类型的作品
    public List<Integer> tui1(Integer id){
        return uploadMapper.tui1(id);
    }

    //推荐方案2 随机推荐
    public List<Upload> tui2(Integer id,Integer id1){
        return uploadMapper.tui2(id,id1);
    }

    //计算总数
    public int sum(){
        return uploadMapper.sum();
    }

    //查询点赞，评论数，关注的问题数，别人对你的邀请总数
    public Upload za(Integer myid){
        return uploadMapper.za(myid);
    }

    //查询问题数
    public Integer issue(@Param("myid")Integer myid){
        return uploadMapper.issue(myid);
    }

    //查询邀请数
    public Integer invite(@Param("myid")Integer myid){
        return uploadMapper.invite(myid);
    }

}
