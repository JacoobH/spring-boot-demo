package com.blogspot.danserlesgens.springbootdemo.controller;

import com.blogspot.danserlesgens.springbootdemo.pojo.Video;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/th")
public class ThymeleafController {
    @PostMapping("/postform")
    public String postForm(Video video, ModelMap map) {
        System.out.println(video.getName());
        map.addAttribute("video",video.getName());
        return "index";
    }
}
