package com.blogspot.danserlesgens.springbootdemo.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

public class Video implements Serializable {
    private int no;
    private String name;
    private String Path;
    private String Type;
    private String desc;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return Path;
    }

    public void setPath(String path) {
        Path = path;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
