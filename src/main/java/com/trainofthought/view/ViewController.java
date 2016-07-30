package com.trainofthought.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    @RequestMapping("/main")
    public String showGraphPage() {
        return "MainGraphPage";
    }
}
