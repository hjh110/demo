package com.newer.demo3.controller;


import com.newer.demo3.domain.Users;
import com.newer.demo3.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class controller {

    @Autowired
    private UploadService service;

    @RequestMapping("selAll")
    public ResponseEntity<?> selAll(){
        return new ResponseEntity<>(service.selAll(),HttpStatus.OK);
    }

    @RequestMapping("login")
    public ResponseEntity<?> loginUser(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            HttpSession session) {
        Users users = new Users();
        users.setPwd(password);
        users.setUsername(username);
        Users user = service.longin(users);
        if (user != null) {
            // 不显示明文密码
            user.setPwd(replaceAction(user.getPwd(), "\\w(?=\\w{0})"));
        }
        session.setAttribute("user", user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    /**
     * String的替换,以达到保密效果
     *
     * @param str
     * @param regular
     * @return
     */
    private static String replaceAction(String str, String regular) {
        return str.replaceAll(regular, "*");
    }

    @RequestMapping("register")
    public ResponseEntity<?> register(Users users){
        return new ResponseEntity<>(service.register(users),HttpStatus.OK);
    }
}
