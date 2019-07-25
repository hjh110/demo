package com.newer.demo3.controller;


import com.newer.demo3.domain.Recommend;
import com.newer.demo3.domain.Upload;
import com.newer.demo3.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class controller {

    @Autowired
    private UploadService service;

    int count=0;
    @RequestMapping("selAll")
    public ResponseEntity<?> selAll(){
        return new ResponseEntity<>(service.selAll(),HttpStatus.OK);
    }


    //推荐
    @RequestMapping("recommend")  //获取的使用户id
    public ResponseEntity recommend(@RequestParam("id")Integer id){

        Recommend<Upload> recommend=new Recommend();

        List<Integer> uploadList = service.tui1(2);

        List<Upload> list = new ArrayList<>();
        for (Integer u :uploadList) {
            System.out.println(u);
            Upload upload = service.za(u);
            if(upload!=null){
                list.add(upload);
            }
        }



       //长度到时候还要改
        if(list.size()<=0 ||  count>=1){
            int id1=(int)(Math.random()*service.sum()+1);
            int id2=(int)(Math.random()*service.sum()+1);


            list=service.tui2(id1,id2);
            if(uploadList.size()<=0){
                int id3=(int)(Math.random()*service.sum()+1);
                int id4=(int)(Math.random()*service.sum()+1);
                list=service.tui2(id3,id4);
            }

        }
        recommend.setAttention(service.issue(id));
        recommend.setInvite(service.invite(id));

        //查询点赞，评论数，关注的问题数，别人对你的邀请总数

        recommend.setList(list);
        count++;

        return new ResponseEntity<>(recommend,HttpStatus.OK);
    }
}
