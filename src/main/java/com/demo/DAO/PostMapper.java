package com.demo.DAO;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.Entity.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PostMapper {

    @Select("SELECT * FROM Post WHERE pid = #{pid}")
    Post selectPostByPid(int pid);

    List<Post> selectAllPost();
}
