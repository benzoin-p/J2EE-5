package com.demo;

import com.demo.Entity.Blog;
import com.demo.Service.BlogService;
import com.demo.Service.BlogServiceImpl;
import com.demo.Service.PostService;
import com.demo.Service.PostServiceImpl;
import com.demo.Util.MyBatisConfig;
import com.demo.DAO.BlogMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.List;

public class DemoApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Application.xml");
        System.out.println("演示开始----------------------------------------------------");
        System.out.println("第一、三、四个功能----------------------------------------------------");
        BlogService blogService = (BlogServiceImpl)ctx.getBean("blogServiceImpl");
        blogService.printDetailBlogInfo(1);
        blogService.printDetailBlogInfo(2);
        System.out.println("第二个功能(已开启懒加载)----------------------------------------------------");
        PostService postService = (PostServiceImpl)ctx.getBean("postServiceImpl");
        postService.printAllPostPbody();



          //用于测试是否成功连接数据库
//        SqlSession session = MyBatisConfig.getSession();
//        BlogMapper blogMapper = session.getMapper(BlogMapper.class);
//        System.out.println(blogMapper.selectAllBlog());

          //用于测试bean装配情况
//        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
//        for (String string : beanDefinitionNames) {
//            System.out.println(string);
//        }


    }
}
