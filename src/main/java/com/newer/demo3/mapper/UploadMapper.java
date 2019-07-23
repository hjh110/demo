package com.newer.demo3.mapper;

import com.newer.demo3.domain.Upload;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UploadMapper {

    @Select("select * from upload")
    public List<Upload> selAll();

}
