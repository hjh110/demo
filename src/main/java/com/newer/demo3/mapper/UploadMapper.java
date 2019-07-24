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
    @Select("select username,pwd from user where username=#{username} and pwd=#{pwd}")
    public Users longin(@Param("username") String username,
                        @Param("pwd")String pwd);
    //注册
    @Insert("insert into user (userid,username,pwd) values(null,#{username},#{pwd})")
    public int register(Users users);

}
