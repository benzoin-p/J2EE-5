package com.demo.DAO;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.Entity.Author;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
public interface AuthorMapper {

    @Select("SELECT * FROM Author WHERE aid = #{aid}")
    Author selectAuthorByAid(int aid);
}
