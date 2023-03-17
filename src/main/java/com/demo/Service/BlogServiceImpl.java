package com.demo.Service;

import com.demo.DAO.BlogMapper;
import com.demo.Entity.Blog;
import com.demo.Entity.Post;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 博客服务层实现类
 *
 * @author DeaDLockey
 * @date 2022/11/01
 */
@Service
public class BlogServiceImpl implements BlogService,BlogMapper{

    private SqlSessionTemplate sqlSession;

    private BlogMapper blogMapper;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
        blogMapper = sqlSession.getMapper(BlogMapper.class);
    }

    @Override
    public void printBlogInfo(int bid)
    {
        Blog blog = selectBlogByBid(bid);
//        System.out.println("post的类型为"+blog.getPosts().getClass().getName());
        System.out.println(blog.toString());
    }

    @Override
    public List<Blog> getAllBlog() {
        return selectAllBlog();
    }

    @Override
    public void printDetailBlogInfo(int bid)
    {
        Blog blog = selectBlogDetails(bid);
        List<Post> postList = blog.getPosts();
        if(!postList.isEmpty())
        {
            for(Post post:postList)
            {
                System.out.println("Blog"+blog.getBid()+"的"+post.getPid()+"的类型为"+post.getClass().getName());
            }
        }
        System.out.println(blog.toString());
    }

    @Override
    public Blog selectBlogByBid(int bid) {
        return blogMapper.selectBlogByBid(bid);
    }

    @Override
    public List<Blog> selectAllBlog() {
        return blogMapper.selectAllBlog();
    }

    @Override
    public Blog selectBlogDetails(int bid) {
        return blogMapper.selectBlogDetails(bid);
    }


}
