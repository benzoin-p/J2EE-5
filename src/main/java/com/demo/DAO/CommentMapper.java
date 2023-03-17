package com.demo.DAO;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.Entity.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface CommentMapper {

    @Select("SELECT * FROM Comment WHERE cid = #{cid}")
    Comment selectCommentByCid(int cid);

    @Select("SELECT * FROM Comment WHERE pid = #{pid}")
    Comment selectCommentByPid(int pid);
}
