package com.blogspot.danserlesgens.springbootdemo.service;

import com.blogspot.danserlesgens.springbootdemo.pojo.Video;

import java.util.List;

public interface IVideoService {
    void add(Video video) throws Exception;
    void modify(Video video) throws Exception;
    void delete(Video video) throws Exception;

    Video getById(int id) throws Exception;
    List<Video> getListByAll() throws Exception;
}
