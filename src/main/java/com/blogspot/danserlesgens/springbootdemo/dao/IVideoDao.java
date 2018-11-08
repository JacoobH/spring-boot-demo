package com.blogspot.danserlesgens.springbootdemo.dao;

import com.blogspot.danserlesgens.springbootdemo.pojo.Video;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface IVideoDao {
    void insert(Video video) throws Exception;
    void delete(Video video) throws Exception;
    void update(Video video) throws Exception;
    Video selectById(int id) throws Exception;
    List<Video> selectListByAll() throws Exception;

}
