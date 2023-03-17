package com.demo.Entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Data
@ToString
public class Post {

    public int pid;
    public int bid;
    public int aid;
    public int draft;
    public String pbody;
    public Date pcreateTime;
    public List<Comment> comments;
    public List<Tag> tags;

    public Post() {
    }
}
