package com.blogspot.danserlesgens.springbootdemo.service.impl;

import com.blogspot.danserlesgens.springbootdemo.dao.IVideoDao;
import com.blogspot.danserlesgens.springbootdemo.pojo.Video;
import com.blogspot.danserlesgens.springbootdemo.service.IVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class VideoServiceImpl implements IVideoService {
    private IVideoDao vd = null;
    @Autowired
    public void setVd(IVideoDao vd){
        this.vd = vd;
    }
    @Override
    public void add(Video video) throws Exception {
        vd.insert(video);
    }

    @Override
    public void modify(Video video) throws Exception {
        vd.update(video);
    }

    @Override
    public void delete(Video video) throws Exception {
        vd.delete(video);
    }

    @Override
    public Video getById(int id) throws Exception {
        return vd.selectById(id);
    }

    @Override
    public List<Video> getListByAll() throws Exception {
        return vd.selectListByAll();
    }
}
