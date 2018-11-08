package com.blogspot.danserlesgens.springbootdemo.controller;

import com.blogspot.danserlesgens.springbootdemo.pojo.Video;
import com.blogspot.danserlesgens.springbootdemo.result.ResultMessage;
import com.blogspot.danserlesgens.springbootdemo.service.IVideoService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/video")
public class VideoController {
    private IVideoService vs = null;
    @Autowired
    public void setVs(IVideoService vs) {
        this.vs = vs;
    }

    @RequestMapping("/add")
    public ResultMessage add(Video video) throws Exception {
        vs.add(video);
        ResultMessage resultMessage = new ResultMessage();
        resultMessage.setStatus("Y");
        resultMessage.setMessage("增加视频成功");
        return resultMessage;
    }
    @RequestMapping("/getVideo")
    public Video getVideo(int id) throws Exception {
        return vs.getById(id);
    }
    @RequestMapping("/getAllVideo")
    public List<Video> getAllVideo() throws Exception {
        return vs.getListByAll();
    }
}
