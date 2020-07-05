package com.grayson.top.covid2019.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author peng.wei
 * @date 2020/7/4 10:52
 * @description
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping("/")
    public String getMain() {
        return "index";
    }

}
