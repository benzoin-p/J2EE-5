package com.demo.DAO;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.Entity.Tag;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TagMapper {

    @Select("SELECT * FROM Tag WHERE tid = #{tid}")
    Tag selectTagByTid(int tid);

    @Select("SELECT * FROM Tag WHERE pid = #{pid}")
    Tag selectTagByPid(int pid);
}
