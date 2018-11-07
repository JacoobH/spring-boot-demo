package com.blogspot.danserlesgens.springbootdemo.controller;

import com.blogspot.danserlesgens.springbootdemo.pojo.Video;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/video")
public class VideoController {
    @RequestMapping("/getVideo")
    public Video getVideo(){
        Video video = new Video();
        video.setNo(1);
        video.setName("西西里的美丽传说");
        video.setPath("/video/movie/The_beautiful_legend_of_Sicily.mp4");
        video.setType("video/mp4");
        video.setDesc("《西西里的美丽传说》是由朱塞佩·托纳多雷执导，莫尼卡·贝鲁奇、圭塞佩·苏尔法罗等主演的剧情片，于2000年10月27日在意大利上映。该片通过少年雷纳多的视角，讲述了二战时期的意大利西西里岛上的美丽少妇玛琳娜的故事。");
        return video;
    }
}
