package com.newer.demo3.mapper;

import com.newer.demo3.domain.Upload;
import com.newer.demo3.domain.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UploadMapper {

    @Select("select * from upload")
    public List<Upload> selAll();

    //登录
    @Select("select * from users where username=#{username} and pwd=#{pwd}")
       Users longin(Users users);

    //注册
    @Insert("insert into users (userid,username,pwd) values(null,#{username},#{pwd})")
       int register(Users users);

}
