package com.demo.Entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class Comment {
    public int cid;
    public int pid;
    public String cbody;
}
