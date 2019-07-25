package com.newer.demo3;

import com.newer.demo3.domain.Recommend;
import com.newer.demo3.domain.Upload;
import com.newer.demo3.service.UploadService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private UploadService service;

    @Test
    public void contextLoads() {
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
        recommend.setList(list);

        System.out.println(recommend.getList().size());

    }

}
