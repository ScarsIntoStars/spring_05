package com.icia.demo.controller;

import com.icia.demo.dto.DemoDTO;
import com.icia.demo.service.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class DemoController {
    DemoService demoService = new DemoService();

    @GetMapping("/req1")
    public String req1(@RequestParam("name") String name, @RequestParam("age") int age, Model model) {
        DemoDTO demoDTO = new DemoDTO();
        demoDTO = demoService.demo1(name, age);
        model.addAttribute("demoDTO", demoDTO);

        return "req1";
    }

    @PostMapping("/req2")
    public String req2(@ModelAttribute DemoDTO demoDTO, Model model) {
        ArrayList demoList =demoService.demo2(demoDTO);
        model.addAttribute("demoList", demoList);
        return "req2"; // 인덱스아님 바꿔야됨
    }

    @GetMapping("/demo1")
    public String demo1(){
        return "demo1";
    }

    @GetMapping("/demo2")
    public String demo2(){
        return "demo2";
    }

}
