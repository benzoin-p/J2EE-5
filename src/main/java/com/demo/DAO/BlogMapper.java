package com.demo.DAO;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.Entity.Blog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 博客映射器
 *
 * @author DeaDLockey
 * @date 2022/11/01
 */
@Mapper
public interface BlogMapper{

//    @Select("SELECT * FROM Blog WHERE aid = #{bid}")
    Blog selectBlogByBid(int bid);

//    @Select("SELECT * FROM Blog")
    List<Blog> selectAllBlog();

    Blog selectBlogDetails(int bid);


}
