package com.blogspot.danserlesgens.springbootdemo.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Alias("Video")
public class Video implements Serializable {
    private int id;
    private String name;
    private String Path;
    private String Type;
    @JsonIgnore
    private String desc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
