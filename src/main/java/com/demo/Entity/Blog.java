package com.demo.Entity;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * 博客
 *
 * @author DeaDLockey
 * @date 2022/11/01
 */
@Data
public class Blog {
    public int bid;
    public int aid;
    public String title;
    public Author author;
    public List<Post> posts;
    public State state;

    @Override
    public String toString() {
        return "Blog{" +
                "\n bid=" + bid +
                ", aid=" + aid +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", state=" + state +
                ",\n posts=" + posts +
                "\n}";
    }
}
