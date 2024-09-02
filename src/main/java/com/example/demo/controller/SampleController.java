package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SampleController {
    @GetMapping("/sample/test01")
    public String test01(Model model) {
        List<String> list1 = new ArrayList<>();
        list1.add("개나리");
        list1.add("진달래");
        list1.add("무궁화");
        model.addAttribute("list1", list1);
        return "sample/test01";
    }
}
