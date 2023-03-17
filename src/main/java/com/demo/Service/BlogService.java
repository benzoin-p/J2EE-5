package com.demo.Service;

import com.demo.Entity.Blog;

import java.util.List;

public interface BlogService {

    public List<Blog> getAllBlog();
    public void printBlogInfo(int bid);

    public void printDetailBlogInfo(int bid);
}
