package com.demo.Entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Data
public class DraftPost extends Post{
    public int pid;
    public int bid;
    public int aid;
    public int draft;
    public String pbody;
    public Date pcreateTime;
    public List<Comment> comments;
    public List<Tag> tags;
    public DraftPost() {
    }

    @Override
    public String toString() {
        return "\nDraftPost(" +
                " pid=" + pid +
                ", bid=" + bid +
                ", aid=" + aid +
                ", draft=" + draft +
                ", pbody='" + pbody + '\'' +
                ", pcreateTime=" + pcreateTime +
                ",\n comments=" + comments +
                ",\n tags=" + tags +
                "";
    }
}
