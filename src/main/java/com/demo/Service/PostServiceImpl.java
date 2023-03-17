package com.demo.Service;

import com.demo.DAO.BlogMapper;
import com.demo.DAO.PostMapper;
import com.demo.Entity.Blog;
import com.demo.Entity.Post;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class PostServiceImpl implements PostService, PostMapper {

    private SqlSessionTemplate sqlSession;

    private PostMapper postMapper;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
        postMapper = sqlSession.getMapper(PostMapper.class);
    }


    @Override
    public Post selectPostByPid(int pid) {
        return postMapper.selectPostByPid(pid);
    }

    @Override
    public List<Post> selectAllPost() {
        return postMapper.selectAllPost();
    }

    @Override
    public void printAllPostPbody() {
        List<Post> postList = selectAllPost();
        for(Post post:postList)
        {
            System.out.println("----博客内容为："+post.getPbody());
        }
    }
}
