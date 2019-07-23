package com.newer.demo3;

import com.newer.demo3.domain.Upload;
import com.newer.demo3.service.UploadService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private UploadService service;

    @Test
    public void contextLoads() {
        for (Upload upload : service.selAll()) {
            System.out.println(upload);
        }
    }

}
