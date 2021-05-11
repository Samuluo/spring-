package com.hjh.spring.pojo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component(value = "HobbyToId")
public interface HobbyToId {
    @Select("select * from student2 where hobby=#{hobby}")
    Student selectid(String hobby);
}
